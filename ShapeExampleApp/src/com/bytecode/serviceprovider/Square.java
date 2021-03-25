package com.bytecode.serviceprovider;

import com.bytecode.interface1.Shape;

public class Square implements Shape{

	@Override
	public void shape() {
		System.out.println("This is from Square class");
		
	}

	@Override
	public void draw() {
		System.out.println("drawing a square");
		
	}

}
