package cn.javass.spring.chapter2.helloworld;

import org.junit.Assert;
import org.junit.Test;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
	@Test
	public void testHelloWorld() {
		// 1、读取配置文件实例化一个IoC容器
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"helloworld.xml");
		// 2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
		HelloApi helloApi = context.getBean("hello", HelloApi.class);
		// 3、执行业务逻辑
		helloApi.sayHello();
	}

	@Test
	public void testNamingBean1() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"namingbean1.xml");
		
		HelloApi helloApi = context.getBean(HelloApi.class);
		helloApi.sayHello();

	}
	
	@Test
	public  void testNamingBean2()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("namingbean2.xml");
		
		HelloApi helloApi = context.getBean("bean", HelloApi.class);
		helloApi.sayHello();
	}
	
	@Test
	public void testNamingBean3()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("namingbean3.xml");
		
		HelloApi helloApi = context.getBean("bean", HelloApi.class);
		helloApi.sayHello();
	}
	
	@Test
	public void test4()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("namingbean4.xml");
		HelloApi helloApi = beanFactory.getBean("bean1", HelloApi.class);
		helloApi.sayHello();
		
		helloApi = beanFactory.getBean("alias1", HelloApi.class);
		helloApi.sayHello();
		
		helloApi = beanFactory.getBean("bean3", HelloApi.class);
		helloApi.sayHello();
		
		String[] aliases = beanFactory.getAliases("bean3");
		Assert.assertEquals(0, aliases.length);
	}
	
	@Test
	public void test5()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("namingbean5.xml");
		HelloApi api = beanFactory.getBean("bean1", HelloApi.class);
		api.sayHello();
		
		String[] aliases = beanFactory.getAliases("bean1");
		Assert.assertEquals(4, aliases.length);
		
		aliases = beanFactory.getAliases("bean2");
		Assert.assertEquals(2, aliases.length);
	}
	
	@Test
	public void test6()
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("namingbean6.xml");
		HelloApi api = beanFactory.getBean("bean", HelloApi.class);
		api.sayHello();
		
		api = beanFactory.getBean("alias1", HelloApi.class);
		api.sayHello();
		
		String[] aliases = beanFactory.getAliases("bean");
		Assert.assertEquals(2, aliases.length);
	}
}