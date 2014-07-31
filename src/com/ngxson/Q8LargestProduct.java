package com.ngxson;

import java.math.BigInteger;

class Q8LargestProduct {
	/*
	 * https://projecteuler.net/problem=8
	 * answer=23514624000

	The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
	
	(See Q8String.java)
	
	Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
	*/
	public static void main(String[] arg) {
		String a = Q8String.a;
		int length = a.length();
		int digit = 13;
		int products = length - digit +1 ;
		
		BigInteger largest = BigInteger.valueOf(0);
		
		for(int i=1; i<=products; i++) {
			BigInteger multiple = BigInteger.valueOf(1);
			
			for(int t=i;
					t <= i+(digit-1); //digits in one product
					t++) {
				char a_char = a.charAt( t-1 );
				int b = Character.getNumericValue(a_char);
				//System.out.print(b);
				multiple = multiple.multiply(BigInteger.valueOf(b));
			}
			
			if(largest.compareTo(multiple)==(-1)) {
				largest = multiple;
			}
			//System.out.println("   product="+multiple);
		}
		
		System.out.println("answer="+largest);
		
	}
}