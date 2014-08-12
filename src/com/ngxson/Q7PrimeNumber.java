package com.ngxson;

class Q7PrimeNumber {
	/*
	 * https://projecteuler.net/problem=7
	 * answer=104743
	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
	we can see that the 6th prime is 13.

	What is the 10 001st prime number?
	*/
	
	public static void main(String[] arg) {	
		//ENTER NUMBER HERE:
		int countNumber = 10001;
		

		System.out.println("answer=" + Utils.getPrimeNumber(countNumber));
	}
}