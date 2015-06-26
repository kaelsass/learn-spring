package cn.javass.spring.chapter3.helloworld;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class DependencyInjectTest {

	@Test
	public void testConstructorDependencyInjectTest()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("constructorDependencyInject.xml");
		HelloApi api = beanFactory.getBean("byIndex", HelloApi.class);
		api.sayHello();
		
		api = beanFactory.getBean("byType", HelloApi.class);
		api.sayHello();
		
		api = beanFactory.getBean("byName", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testConstructorDependencyInjectStaticFactoryTest()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("constructorDependencyInjectStaticFactory.xml");
		HelloApi api = beanFactory.getBean("byIndex", HelloApi.class);
		api.sayHello();
		
		api = beanFactory.getBean("byType", HelloApi.class);
		api.sayHello();
		
		api = beanFactory.getBean("byName", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testConstructorDependencyInjectInstanceFactoryTest()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("constructorDependencyInjectInstanceFactory.xml");
		HelloApi api = beanFactory.getBean("byIndex", HelloApi.class);
		api.sayHello();
		
		api = beanFactory.getBean("byType", HelloApi.class);
		api.sayHello();
		
		api = beanFactory.getBean("byName", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testSetterDependencyInject()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("setterDependencyInject.xml");
		HelloApi api = beanFactory.getBean("bean", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testBooleanBean()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("booleanTestBean.xml");
		BooleanTestBean bean = beanFactory.getBean("bean1", BooleanTestBean.class);
		bean.printSuccess();
		
		bean = beanFactory.getBean("bean2", BooleanTestBean.class);
		bean.printSuccess();
		
		bean = beanFactory.getBean("bean3", BooleanTestBean.class);
		bean.printSuccess();
	}
	
	@Test
	public void testIdRefInject()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/idRefInject.xml");
		IdRefTestBean bean = beanFactory.getBean("idRefBean1", IdRefTestBean.class);
		bean.print();
		
		bean = beanFactory.getBean("idRefBean2", IdRefTestBean.class);
		bean.print();
		
		bean = beanFactory.getBean("idRefBean3", IdRefTestBean.class);
		bean.print();
	}
	
	@Test
	public void testListBean()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/listInject.xml");
		ListTestBean bean = beanFactory.getBean("bean", ListTestBean.class);
		for(int value : bean.getValues())
		{
			System.out.println("value: " + value);
		}
		Assert.assertEquals(2, bean.getValues().size());
	}
	
	@Test
	public void testBeanInject()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("chapter3/beanInject.xml");
		HelloApiDecorator bean = beanFactory.getBean("decorator1", HelloApiDecorator.class);
		bean.sayHello();
		
		bean = beanFactory.getBean("decorator2", HelloApiDecorator.class);
		bean.sayHello();
		
		bean = beanFactory.getBean("decorator3", HelloApiDecorator.class);
		bean.sayHello();
	}
	
	@Test(expected = BeanCurrentlyInCreationException.class)
	public void testCircleByConstructor() throws Throwable
	{
		try
		{
			new ClassPathXmlApplicationContext("chapter3/circleInjectByConstructor.xml");
		}
		catch(Exception e)
		{
			Throwable e1 = e.getCause().getCause().getCause();
			throw e1;
		}
	}
}
