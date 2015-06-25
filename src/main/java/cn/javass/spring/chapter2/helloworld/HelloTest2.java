package cn.javass.spring.chapter2.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest2 {
	@Test
	public void testInit()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("instantiatingBean.xml");
		HelloApi api = beanFactory.getBean("bean1", HelloApi.class);
		api.sayHello();
		
		api = beanFactory.getBean("bean2", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testInitStaticFactory()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("instantiatingBean.xml");
		HelloApi api = beanFactory.getBean("bean3", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testInitBeanFactory()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("instantiatingBean.xml");
		HelloApi api = beanFactory.getBean("bean4", HelloApi.class);
		api.sayHello();
	}
	
}
