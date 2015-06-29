package cn.javass.spring.chapter6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter6.service.IHelloWorldService;
import cn.javass.spring.chapter6.service.IIntroductionService;

public class Test {
	public static void main(String[] args)
	{
		System.out.println("======================================");
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chapter6/advice.xml");
		IHelloWorldService helloworldService = ctx.getBean("helloWorldService",
				IHelloWorldService.class);
		helloworldService.sayAdvisorBefore("haha");
		System.out.println("======================================");
	}
}
