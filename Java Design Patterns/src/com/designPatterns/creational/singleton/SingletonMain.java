package com.designPatterns.creational.singleton;

public class SingletonMain {
	private SingletonMain() {}
	private static SingletonMain object;
	public static SingletonMain getInstance() {
		//LAZY LOADING
		if(object == null) {
			System.out.println("Object Created");
			object =  new SingletonMain();
		}
		return object;
	}
	
	public static void main(String[] args) {
		getInstance();
		getInstance();
		getInstance();
		getInstance();
	}

}
