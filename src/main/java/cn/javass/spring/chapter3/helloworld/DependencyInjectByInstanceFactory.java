package cn.javass.spring.chapter3.helloworld;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class DependencyInjectByInstanceFactory {
	public HelloApi newInstance(String message, int index)
	{
		return new HelloImpl3(message, index);
	}
}
