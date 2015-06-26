package cn.javass.spring.chapter3.helloworld;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public abstract class HelloImpl5 implements HelloApi{

	private Printer printer;
	
	public void sayHello() {
		getPrinter().print("setter");
		createPrototypePrinter().print("prototype");
		createSingletonPrinter().print("singleton");
	}

	public Printer createSingletonPrinter() {
		System.out.println("should never be executed!");
		return new Printer();
	}

	protected abstract Printer createPrototypePrinter();

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}


}
