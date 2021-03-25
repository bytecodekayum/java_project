package com.bytecode.serviceprovider;

import com.bytecode.interface1.Shape;

public class Circle implements Shape {

	@Override
	public void shape() {
		System.out.println("This is from circle");
		
	}

	@Override
	public void draw() {
		System.out.println("drawing a circle");
		
	}

	
}
