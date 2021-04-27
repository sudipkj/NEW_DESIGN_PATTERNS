package com.designpatterns.designpattern.structural.adaptor;

import com.designpatterns.bank.support.MarkerPen;

public class PenAdaptor implements IPen{

	@Override
	public void write(String str) {
		
		MarkerPen markerPen = new MarkerPen();
		markerPen.writeOnBoard(str);
		
	}

	
	
}
