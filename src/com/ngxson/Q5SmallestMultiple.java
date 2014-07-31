package com.ngxson;

class Q5SmallestMultiple {
	/*
	 * https://projecteuler.net/problem=5
	 * answer=232792560
	 * time run ~ 9s
	 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	
	public static int num = 20;
	
	public static void main(String[] arg) {
		long startTime = System.currentTimeMillis();
		int a = 2;
		while(!divByAll(a)) {
			a = a+1;
		}
		System.out.println("answer="+a);
		
		//time run
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("time run="+((double)totalTime)/1000+"s");
	}
	
	public static Boolean divByAll(int a) {
		for(int i=1 ; i <= num ; i++)
			if(a % i > 0) return false;
		return true;
	}
}