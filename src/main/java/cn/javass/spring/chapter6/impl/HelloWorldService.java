package cn.javass.spring.chapter6.impl;

import cn.javass.spring.chapter6.service.IHelloWorldService;

public class HelloWorldService implements IHelloWorldService {

	public void sayHello() {
		System.out.println("================hello world");
	}

}
