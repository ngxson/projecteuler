package com.ngxson;

class First {
	/*
	 * https://projecteuler.net/problem=1
	 * SUM = 233168
	If we list all the natural numbers below 10 that are multiples of 3 or 5,
	we get 3, 5, 6 and 9. The sum of these multiples is 23.

	Find the sum of all the multiples of 3 or 5 below 1000.
	*/
	
	public static void main(String[] arguments) {
	    double count = 0;
	    double sum = 0;
	    //MAX NUMBER HERE:
	    int max = 1000;
	    //

	    for (int i=1 ; i<max ; i++){
	        count = count + 1;
	        if (count % 3 == 0 || count % 5 == 0) {
	        	System.out.println(count);
	        	sum = sum+count;
	        }
	   }
	   System.out.print("SUM = ");
	   System.out.println((int) sum);
	}
}