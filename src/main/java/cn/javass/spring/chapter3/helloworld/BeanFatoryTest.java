package cn.javass.spring.chapter3.helloworld;

import org.junit.Test;

import cn.javass.spring.chapter2.helloworld.HelloImpl2;

public class BeanFatoryTest {
	@Test
	public void testPrototype()
	{
		DefaultBeanFactory dbf = new DefaultBeanFactory();
		BeanDefinition bd = new BeanDefinition();
		bd.setId("bean");
		bd.setClazz(HelloImpl2.class.getName());
		dbf.registerBeanDefinition(bd);
		System.out.println(dbf.getBean("bean") != dbf.getBean("bean"));
	}
}
