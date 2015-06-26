package cn.javass.spring.chapter3.helloworld;

import java.util.HashMap;
import java.util.Map;

public class BeanDefinitionRegister {
	private static Map<String, BeanDefinition> DEFINITIONS = new HashMap<String, BeanDefinition>();
	
	public void registerBeanDefinition(String beanName, BeanDefinition bd)
	{
		if(DEFINITIONS.containsKey(beanName))
			throw new RuntimeException("[" + beanName + "] definition exists.");
		DEFINITIONS.put(beanName, bd);
	}
	
	public BeanDefinition getBeanDefinition(String beanName)
	{
		return DEFINITIONS.get(beanName);
	}
	public boolean containsBeanDefinition(String beanName)
	{
		return DEFINITIONS.containsKey(beanName);
	}
}
