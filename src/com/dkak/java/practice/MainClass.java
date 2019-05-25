package com.dkak.java.practice;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		MathOverriding math = new MathOverriding();
		System.out.println(math.addition(10, 70, 3));
		System.out.println(math.sub(23, 20));
		System.out.println(math.mul(7, 5.3));
		System.out.println(math.div(41, 5.3));

		Rectangle r1 = new Rectangle(7, 5);
		Rectangle r2 = new Rectangle(7, 4);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1.equals(r2));

		int[] arr = {12, 67, 78, 32 };
		
		  Arraycomparison arr1 = new Arraycomparison(); 
		  int[] res = arr1.compare(arr);
		 
		  for (int k : res) { System.out.print(k + " "); }
		 
		Arrays.sort(arr);
		for (int k : arr)
			System.out.println(k);

		Person1[] parr = new Person1[4];
		parr[0] = new Person1(12, "Ak");
		parr[1] = new Person1(56, "Bk");
		parr[2] = new Person1(99, "Ck");
		parr[3] = new Person1(67, "Dk");
		
		Arrays.sort(parr);

		for (Person1 k : parr) {

			System.out.println(k);

		}
	}
}
