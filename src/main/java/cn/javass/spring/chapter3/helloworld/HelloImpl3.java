package cn.javass.spring.chapter3.helloworld;

import java.beans.ConstructorProperties;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class HelloImpl3 implements HelloApi {

	private String message;
	private int index;
	public HelloImpl3()
	{
		message = "Hello World!";
	}
	
	@ConstructorProperties({"message", "index"})
	public HelloImpl3(String message, int index)
	{
		this.message = message;
		this.index = index;
	}
	public void sayHello() {
		System.out.println(index + " : " + message);

	}

}
