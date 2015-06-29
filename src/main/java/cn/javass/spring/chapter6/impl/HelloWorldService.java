package cn.javass.spring.chapter6.impl;

import cn.javass.spring.chapter6.service.IHelloWorldService;

public class HelloWorldService implements IHelloWorldService {

	public void sayHello() {
		System.out.println("================hello world");
	}

	public void sayBefore(String param) {
		System.out.println("================say " + param);
	}

	public boolean sayAfterReturning() {
		System.out.println("================say after returning");
		return true;
	}

	public void sayAfterThrowing() {
		System.out.println("================say after throwing");
		throw new RuntimeException();
	}

	public void sayAfterFinally() {
		System.out.println("================say after finally");
		throw new RuntimeException();
	}

	public void sayAround(String param) {
		System.out.println("================say around param:" + param);
	}

	public void sayAdvisorBefore(String param) {
		System.out.println("================say advisor before param:"+ param);
	}

}
