package cn.javass.spring.chapter2.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter3.helloworld.HelloApiDecorator;

public class test {
	{
		System.out.println("a");
	}

	public test() {
		System.out.println("construct");
	}

	{
		System.out.println("b");
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"chapter3/lookupMethodInject.xml");
		System.out.println("=======singleton sayHello======");
		HelloApi helloApi1 = context.getBean("helloApi1", HelloApi.class);
		helloApi1.sayHello();
		helloApi1 = context.getBean("helloApi1", HelloApi.class);
		helloApi1.sayHello();
		System.out.println("=======prototype sayHello======");
		HelloApi helloApi2 = context.getBean("helloApi2", HelloApi.class);
		helloApi2.sayHello();
		helloApi2 = context.getBean("helloApi2", HelloApi.class);
		helloApi2.sayHello();
	}

}
