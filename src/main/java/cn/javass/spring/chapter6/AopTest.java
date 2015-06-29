package cn.javass.spring.chapter6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.javass.spring.chapter6.service.IHelloWorldService;

public class AopTest {
	@Test
	public void testHelloworld() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chapter6/helloworld.xml");
		IHelloWorldService helloworldService = ctx.getBean("helloWorldService",
				IHelloWorldService.class);
		helloworldService.sayHello();
	}
}