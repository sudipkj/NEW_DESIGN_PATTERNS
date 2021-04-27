package com.designpatterns.designpattern.contoller.eagerLoading;

public class EagerLoadingStaticBlockSingleton {

	private final static EagerLoadingStaticBlockSingleton eagerLoadingStaticBlockSingleton;
	
	private EagerLoadingStaticBlockSingleton() {
		
	}
	static {
		eagerLoadingStaticBlockSingleton = new EagerLoadingStaticBlockSingleton();
	}
	
	private static EagerLoadingStaticBlockSingleton getIntance() {
		return eagerLoadingStaticBlockSingleton;
	}
}
