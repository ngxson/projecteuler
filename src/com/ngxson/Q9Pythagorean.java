package com.ngxson;

class Q9Pythagorean {
	/*
	 * https://projecteuler.net/problem=9
	 * answer=31875000
	 A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

	a^2 + b^2 = c^2
	For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

	There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	Find the product abc.
	 */
	public static void main(String[] arg) {
		int n = 1000;
		int z;
		int sum;
		for(int x=1 ; x < n ; x++) {
			for(int y=1 ; y < n ; y++) {
				z = (int) Math.sqrt(x*x + y*y);
				sum = x + y + z;
				if (x*x + y*y == z*z // is Pythagorean triplet
						& sum == n 
						& x<y) Utils.p("answer=" + x*y*z);
			}
		}
	}
}