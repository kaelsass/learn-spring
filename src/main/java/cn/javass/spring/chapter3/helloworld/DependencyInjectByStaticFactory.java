package cn.javass.spring.chapter3.helloworld;

import java.beans.ConstructorProperties;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class DependencyInjectByStaticFactory {
	public static HelloApi newInstance(String message, int index)
	{
		return new HelloImpl3(message, index);
	}
}
