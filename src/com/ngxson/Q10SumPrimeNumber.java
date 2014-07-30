package com.ngxson;

class Q10SumPrimeNumber{
	/*
	 * https://projecteuler.net/problem=10
	 * time run ~ 5 seconds
	 * answer=142913828922
	The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

	Find the sum of all the primes below two million.
	*/
	public static void main(String[] arg) {	
		//ENTER NUMBER HERE:
		int maxNumber = 2000000;
		int count = 1;
		long sum = 0;
		long startTime = System.currentTimeMillis();
			for(int i=2 ; i<maxNumber ; i++) {
				if(PrimeNumber.isPrime(i)) {
					System.out.print("count= " + count);
					System.out.print("    num= " + i);
					sum = sum + i;
					System.out.println("    sum= "+sum);
					count = count+1;
				}//print out if isPrime=true
			}
			long endTime   = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println("answer="+sum);
			System.out.println("time run="+((double)totalTime)/1000+"s");
	}
	
}