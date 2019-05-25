package com.dkak.java.practice;

public class Arraycomparison {

	int[] compare(int[] arr) {

		int temp = 0;
		{

			for (int i = 0; i <= arr.length - 1; i++) {

				for (int j = 0; j <= arr.length - 2; j++) {
					if (arr[j] > arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;

					}

				}

			}

		}
		return arr;
	} 
}
