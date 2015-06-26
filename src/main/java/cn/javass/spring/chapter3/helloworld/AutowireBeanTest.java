package cn.javass.spring.chapter3.helloworld;

import java.io.IOException;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.javass.spring.chapter2.helloworld.HelloApi;

public class AutowireBeanTest {
	@Test
	public void testAutowireByName() throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"chapter3/autowire-byName.xml");
		HelloApi helloApi = context.getBean("bean", HelloApi.class);
		helloApi.sayHello();
	}
	
	@Test
	public void testAutowireByType()
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"chapter3/autowire-byType.xml");
		HelloApi helloApi = context.getBean("bean", HelloApi.class);
		helloApi.sayHello();
	}
}