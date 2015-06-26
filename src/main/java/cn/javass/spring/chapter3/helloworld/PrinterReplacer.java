package cn.javass.spring.chapter3.helloworld;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class PrinterReplacer implements MethodReplacer {

	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		System.out.println("Print Replacer");
		return null;
	}

}
