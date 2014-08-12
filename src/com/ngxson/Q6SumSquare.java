package com.ngxson;

class Q6SumSquare {
	/*
	 * https://projecteuler.net/problem=6
	 * answer=25164150
	The sum of the squares of the first ten natural numbers is,
	1^2 + 2^2 + ... + 10^2 = 385
	
	The square of the sum of the first ten natural numbers is,
	(1 + 2 + ... + 10)^2 = 55^2 = 3025
	
	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 */
	public static void main(String[] arg) {
		long sum = 0;
		long sumsq = 0;
		for (int i=1 ; i<=100 ; i++) sum = sum + i;
		for (int i=1 ; i<=100 ; i++) sumsq = sumsq + i*i;
		System.out.println("answer=" + (sum*sum-sumsq));
	}
}