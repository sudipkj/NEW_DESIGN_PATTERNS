package com.designpatterns.designpattern.structural.adaptor;

public class Assignment {

	private IPen pen;
	
	public void doAssignment(String str) {
		pen.write(str);
	}
	
	
	public IPen getPen() {
		return pen;
	}

	public void setPen(IPen pen) {
		this.pen = pen;
	}

	
}
