
package com.dkak.java.practice;

public class Rectangle {
	double dimension;

	Rectangle(double length, double breadth) {
		dimension = length * breadth;
	}

	public double area() {
		return dimension;
	}

	public String toString() {
		return new Double(dimension).toString();
	}

	public boolean equals(Object o1) {
		Rectangle r3 = (Rectangle) o1;
		return area() == r3.area();
	}
}
