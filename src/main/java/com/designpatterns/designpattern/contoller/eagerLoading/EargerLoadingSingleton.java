package com.designpatterns.designpattern.contoller.eagerLoading;

//Singleton Object is created at the time of class loading
public class EargerLoadingSingleton {

	private final static EargerLoadingSingleton eargerLoadingSingleton = new EargerLoadingSingleton();
	private EargerLoadingSingleton() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static EargerLoadingSingleton getInstance() {
		
		return eargerLoadingSingleton;
	}
	
	
}
