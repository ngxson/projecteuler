package com.ngxson;

class Q4Palindrome {
	/*
	 * https://projecteuler.net/problem=4
	 * answer=906609
	 A palindromic number reads the same both ways.
	 The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

	Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	public static void main(String[] arg) {
		long max = 0;
		for(int a=1 ; a<1000 ; a++) {
			for(int b=1 ; b<1000 ; b++) {
				if( isPalindrome(a*b) & max<a*b ) {
					max = a*b;
				}
			}
		}
		System.out.println("answer=" + max);
	}
	
	private static Boolean isPalindrome(long a) {
		long c = 0;
		long temp;
		long i;
		long digit = getNumberDigit(a);
		
		for(i=0 ; i<digit ; i++) {
			temp = ( a%pow(10,i+1) - a%pow(10,i)) / pow(10,i);
			c = c + temp*pow(10,digit-i-1);
		}
		if( c==a || a<10 ) return true;
		return false;
	}
	
	private static long getNumberDigit(long a) {
		long b = a;
		long i;
		for(i=0 ; b>0 ; i++) b = b/10;
		return i;
	}
	
	private static long pow(long x, long y) {
		return (long)Math.pow(x, y);
	}
	
}