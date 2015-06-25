package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;
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
}
