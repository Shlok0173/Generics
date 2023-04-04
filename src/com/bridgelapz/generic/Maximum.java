package com.bridgelapz.generic;

public class Maximum {

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {

			max = z;
		}

		return max;
	}

	public static void main(String args[]) {
		System.out.println("Find The Maximum Float Value - "+" " + maximum(12.0f, 14.0f, 6.0f));
	}
}
