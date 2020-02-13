package com.hello.first;

public class HelloJava implements Printer {
	String name;
	Printer printer;
	
	public HelloJava() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public String sayHello() {
		return "Hello " + name;
	}

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		this.printer.print(sayHello());
	}
}
