package cn.javass.spring.chapter6.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class HelloWorldAspect {
	public void beforeAdvice()
	{
		System.out.println("================before advice");
	}
	public void afterFinallyAdvice()
	{
		System.out.println("================after finally advice");
	}
	public void beforeAdvice(String param)
	{
		System.out.println("================before advice param:" + param);
	}
	public void afterReturningAdvice(boolean retVal)
	{
		System.out.println("================after returning advice value:" + retVal);
	}
	public void afterThrowingAdvice(Exception exception)
	{
		System.out.println("================after throwing advice exception:" + exception);
	}
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("================before around");
		Object retVal = pjp.proceed(new String[]{"replace"});
		System.out.println("================after around");
		return retVal;
	}
}
