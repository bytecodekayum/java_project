package com.bytecode.client;

import com.bytecode.factory.ShapeFactory;
import com.bytecode.interface1.Shape;
import com.bytecode.serviceprovider.Circle;
public class ClientApp {
	public static void main(String[] args) {
		/*Shape shape1=ShapeFactory.createShape("square");
		shape1.shape();
		shape1.draw();
		System.out.println(shape1.getClass());*/
		Circle c1=new Circle();
		c1.shape();
		c1.draw();
		
	}
}
