package com.ngxson;

class PrimeNumber {
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
		

		System.out.println("answer=" + getPrimeNumber(countNumber));
	}
	
	public static int getPrimeNumber(int term) {
		int count = 1;
		int i = 2;
			while(count <= term) {
				if(isPrime(i)) {
					System.out.print("count=" + count);
					System.out.println("    value=" + i);
					count = count + 1;
				}//print out if isPrime=true
				i = i + 1;
			}
		return (i - 1);
	}
	
	public static Boolean isPrime(int i) {
		int maxDiv = (int) Math.sqrt((double)i);
		int div = 2;
		while (div <= maxDiv) {
			if(i % div == 0) {
				return false;
			}
			div = div + 1;
		}
		return true;
	}
}