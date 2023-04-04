package com.bridgelapz.generic;

public class Maximum < T extends Comparable <T>>{

	T x;
	T y;
	T z;
	
	
 public Maximum(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
 
 public  T maximum() {
	 return Maximum.maximum(x, y, z);
 }

public static <T extends Comparable>T  maximum(T x ,T y,T z){
	T max=x;
	if(y.compareTo(max)>0) {
		max=y;
	}
		if(z.compareTo(max)>0) {
			max=z;
	}
	printMax(x,y,z,max);
	return max;
}

public static <T> void printMax(T x,T y,T z,T max){
	System.out.println(x , y , z ,max);
}
public static void main(String args[]) {
	Integer xint=13, yint=14,zint=34;
	Float xflt=12.0f, yflt=14.0f,zflt=16.0f;
	
	Maximum.maximum(xint, yint, zint);
	Maximum.maximum(xflt, yflt, zflt);
}
}
