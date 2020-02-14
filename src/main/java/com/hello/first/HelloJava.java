package com.hello.first;

public class HelloJava{
	String name;
	Printer printer;
	
	public HelloJava() {}	 // construct
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	public String sayHello() {
		return "Hello " + name;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		this.printer.print(sayHello());
	}
}
