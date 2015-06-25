package cn.javass.spring.chapter2.helloworld;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		new test();
		BeanFactory beanFactory = new ClassPathXmlApplicationContext(
				"constructorDependencyInjectStaticFactory.xml");
		HelloApi api = beanFactory.getBean("byIndex", HelloApi.class);
		api.sayHello();

		api = beanFactory.getBean("byType", HelloApi.class);
		api.sayHello();

		api = beanFactory.getBean("byName", HelloApi.class);
		api.sayHello();
	}

}
