package cn.javass.spring.chapter2.helloworld;

public class HelloApiInstanceFactory {
	public HelloApi newInstance(String message)
	{
		return new HelloImpl2(message);
	}
}
