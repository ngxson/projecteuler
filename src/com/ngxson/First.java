package com.ngxson;

class First {
	/*
	 * https://projecteuler.net/problem=1
	If we list all the natural numbers below 10 that are multiples of 3 or 5,
	we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below 1000.
	*/
	
	public static void main(String[] arguments) {
		System.out.println("hello");
	    double count = 0;
	    double sum = 0;
	    //MAX NUMBER HERE:
	    int max = 1000;
	    //
	    for (int i=1 ; i<max ; i++){
	        count = count + 1;
	        double b = isDivisible(count, 3.0);
	        double c = isDivisible(count, 5.0);
	        if (b > 0) {
	        	System.out.println((int)b);
	        	sum = sum+b;
	        } else if (c > 0) {
	        	System.out.println((int)c);
	        	sum = sum+c;
	        }
	   }
	   System.out.print("SUM = ");
	   System.out.println((int) sum);
	}
	
	public static double isDivisible(double num, double div) {
        double a = num/div;
        double b = (double) ((int) a);
        double odd = a - b;
        if (odd == 0.0) {
        	return num;
        }
        return 0.0;
	}
}