package cn.javass.spring.chapter3.helloworld;

public class DefaultBeanFactory {
	private BeanDefinitionRegister DEFINITIONS = new BeanDefinitionRegister();
	private final SingletonBeanRegister SINGLETONS = new SingletonBeanRegister();
	
	public Object getBean(String beanName)
	{
		if(!DEFINITIONS.containsBeanDefinition(beanName))
		{
			throw new RuntimeException("[" + beanName + "] definition doesn't exist!");
		}
		BeanDefinition bd = DEFINITIONS.getBeanDefinition(beanName);
		if(bd.getScope() == BeanDefinition.SCOPE_SINGLETON)
		{
			if(!SINGLETONS.containsSingleton(beanName))
			{
				SINGLETONS.registerSingleton(beanName, createBean(bd));
			}
			return SINGLETONS.getSingleton(beanName);
		}
		else if(bd.getScope() == BeanDefinition.SCOPE_PROTOTYPE)
		{
			return createBean(bd);
		}
		throw new RuntimeException("wrong bean scope definition exception!");
	}
	public void registerBeanDefinition(BeanDefinition bd)
	{
		DEFINITIONS.registerBeanDefinition(bd.getId(), bd);
	}
	private Object createBean(BeanDefinition bd)
	{
		try {
			Class<?> clazz = Class.forName(bd.getClazz());
			return clazz.getConstructor().newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
