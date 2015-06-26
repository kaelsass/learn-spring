package cn.javass.spring.chapter3.helloworld;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoreDependencyInjectTest {
	@Test
	public void testDependOn() throws IOException
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter3/depends-on.xml");
		context.registerShutdownHook();
		
		DependentBean bean = context.getBean("dependentBean", DependentBean.class);
		bean.write("aaa");
		
	}
}
