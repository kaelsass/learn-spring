package cn.javass.spring.chapter6;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter6.service.IHelloWorldService;
import cn.javass.spring.chapter6.service.IIntroductionService;

public class AopTest {
	@Test
	public void testHelloworld() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chapter6/helloworld.xml");
		IHelloWorldService helloworldService = ctx.getBean("helloWorldService",
				IHelloWorldService.class);
		helloworldService.sayHello();
	}

	@Test
	public void testSchemaBeforeAdvice() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chapter6/advice.xml");
		IHelloWorldService bean = ctx.getBean("helloWorldService",
				IHelloWorldService.class);
		bean.sayBefore("Xing");
	}

	@Test
	public void testSchemaAfterReturningAdvice() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chapter6/advice.xml");
		IHelloWorldService bean = ctx.getBean("helloWorldService",
				IHelloWorldService.class);
		bean.sayAfterReturning();
	}

	@Test(expected = RuntimeException.class)
	public void testSchemaAfterThrowingAdvice() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chapter6/advice.xml");
		IHelloWorldService bean = ctx.getBean("helloWorldService",
				IHelloWorldService.class);
		bean.sayAfterThrowing();
	}

	@Test(expected = RuntimeException.class)
	public void testSchemaAfterFinallyAdvice() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chapter6/advice.xml");
		IHelloWorldService bean = ctx.getBean("helloWorldService",
				IHelloWorldService.class);
		bean.sayAfterFinally();
	}

	@Test
	public void testSchemaAroundAdvice() {
		System.out.println("======================================");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chapter6/advice.xml");
		IHelloWorldService helloworldService = ctx.getBean("helloWorldService",
				IHelloWorldService.class);
		helloworldService.sayAround("haha");
		System.out.println("======================================");
	}

	@Test
	public void testSchemaIntroduction() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chapter6/advice.xml");
		IIntroductionService bean = ctx.getBean("helloWorldService",
				IIntroductionService.class);
		bean.induct();
	}

	@Test
	public void testSchemaAdvisor() {
		System.out.println("======================================");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chapter6/advice.xml");
		IHelloWorldService helloworldService = ctx.getBean("helloWorldService",
				IHelloWorldService.class);
		helloworldService.sayAdvisorBefore("haha");
		System.out.println("======================================");
	}
}