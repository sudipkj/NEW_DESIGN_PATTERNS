package com.designpatterns.designpattern.structural.adaptor;

public class DesignPatternADPDemo {

	public static void main(String[] args) {
		IPen pen = new PenAdaptor();
		
		Assignment assignment = new Assignment();
		assignment.setPen(pen);
		assignment.doAssignment("I am doing my assignment for the night");
	}

}
