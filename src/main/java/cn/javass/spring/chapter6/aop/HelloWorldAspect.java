package cn.javass.spring.chapter6.aop;

public class HelloWorldAspect {
	public void beforeAdvice()
	{
		System.out.println("================before advice");
	}
	public void afterFinallyAdvice()
	{
		System.out.println("================after finally advice");
	}
}
