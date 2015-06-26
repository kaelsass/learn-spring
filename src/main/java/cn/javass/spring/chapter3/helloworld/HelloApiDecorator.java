package cn.javass.spring.chapter3.helloworld;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class HelloApiDecorator implements HelloApi{
	private HelloApi api;
	private String message;
	
	public HelloApiDecorator()
	{}
	
	public HelloApiDecorator(HelloApi api)
	{
		this.api = api;
	}

	public void sayHello() {
		System.out.println("Decorator before");
		api.sayHello();
		System.out.println("Decorator after");
		
	}

	public HelloApi getApi() {
		return api;
	}

	public void setApi(HelloApi api) {
		this.api = api;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
