package cn.javass.spring.chapter3.helloworld;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class HelloImpl4 implements HelloApi{

	private String message;
	private int index;
	
	public void sayHello() {
		System.out.println(index + " : " + message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
