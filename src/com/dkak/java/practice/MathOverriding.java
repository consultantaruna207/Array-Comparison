/**
 * 
 */
package com.dkak.java.practice;

/**
 * @author Akshara
 *
 */
public class MathOverriding extends Maths {
	@Override
	public int addition(int p, int q, int r) {
		int c = 0;
		c = p + q;
		return (c);
	}

	public double div(int p, double q) {
		double c = 0;
		c = p/q;
		return(c);
	}
}
