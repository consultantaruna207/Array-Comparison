package com.dkak.java.practice;

public abstract class Maths {

	protected int addition(int p, int q) {
		int c = 0;
		c = p + q;
		return (c);
	}

	public int sub(int p, int q) {
		int c = 0;
		c = p - q;
		return (c);
	}

	public double mul(int p, double q) {
		double c = 0;
		c = p * q;
		return (c);
	}

	public int addition(int p, int q, int r) {
		int c = 0;
		c = p + q + r;
		return (c);
	}

	abstract double div(int p, double q);
}
