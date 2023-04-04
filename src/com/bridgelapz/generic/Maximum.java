package com.bridgelapz.generic;

public class Maximum {

	public static <T extends Comparable<T>> void Max(T value1 ,T value2 ,T value3,T value4 ){
		T maximum=value1;
		
		if(value2.compareTo(maximum)>0) {
			maximum=value2;
		}
		if(value3.compareTo(maximum)>0) {
			maximum=value3;
		}
		if(value4.compareTo(maximum)>0) {
			maximum=value4;
		}
		System.out.println("Maximum value:"+" "+maximum);
	}
	
	public static void main(String args[]) {
		Max(12,22,34,555);
	}
}
