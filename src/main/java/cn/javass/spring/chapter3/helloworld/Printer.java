package cn.javass.spring.chapter3.helloworld;

public class Printer {
	private int count = 0;
	public void print(String type)
	{
		System.out.println(type + " printer: " + count++);
	}
}
