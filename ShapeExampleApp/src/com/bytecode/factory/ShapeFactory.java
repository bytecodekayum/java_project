package com.bytecode.factory;
import com.bytecode.interface1.Shape;
import com.bytecode.serviceprovider.Circle;
import com.bytecode.serviceprovider.Rectangle;
import com.bytecode.serviceprovider.Square;

public class ShapeFactory {
	
	public static Shape createShape(String shape) {
		if (shape.equals("circle")) {
			return new Circle();
		}
		else if(shape.equals("rectangle")) {
			return new Rectangle();
		}
		else if(shape.equals("square")) {
			return new Square();
		}
		else {
		return null;
		}
		
	}

}
