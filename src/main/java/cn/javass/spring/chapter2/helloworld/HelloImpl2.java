package cn.javass.spring.chapter2.helloworld;

public class HelloImpl2 implements HelloApi {

	private String message;
	public HelloImpl2()
	{
		message = "Hello World!";
	}
	public HelloImpl2(String mes)
	{
		this.message = mes;
	}
	public void sayHello() {
		System.out.println(message);

	}

}
