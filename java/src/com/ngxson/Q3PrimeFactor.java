package com.ngxson;
class Q3PrimeFactor {
	/*
	 * https://projecteuler.net/problem=3
	 * answer=6857
	 The prime factors of 13195 are 5, 7, 13 and 29.

	What is the largest prime factor of the number 600851475143 ?
	 */
	
    public static void main(String[] args) {
        long m = 600851475143L; // 13195
        int sqrt = (int) Math.floor(Math.sqrt(m));

        for (int i = sqrt; i >= 2; i--) {
            if (m % i == 0 && Utils.isPrime(i)){
                Utils.pln("answer=" + i);
                return;
            }
        }
    }
}