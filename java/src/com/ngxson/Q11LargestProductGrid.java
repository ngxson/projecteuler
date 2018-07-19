package com.ngxson;

class Q11LargestProductGrid {
	/*
	 * https://projecteuler.net/problem=11
	 * answer=70600674
	 In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
	
	(See Q11String.java)
	
	The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
	
	What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
	 */
	
	static int row = 20;
	static int column = 20;
	static int num = 4; //numbers of a product
	
	static int[] n = new int[1000]; //number table
	static int[] nr = new int[1000]; //number table rotated
	static int[] ni = new int[1000]; //number table inversed
	static int count;
	static long largest = 0;
	public static void main(String[] arg) {
		stringToIntArray();
		rotateTable(row, column);
		inverseTable(row, column);
		processLine(n, row, column);
		processLine(nr, column, row);
		processDiagonal(n, row, column);
		processDiagonal(ni, row, column);
		Utils.pln("answer=" + largest);
	}
	
	static void stringToIntArray() {
		String a = Q11String.a;
		int temp = 0;
		count = 1;
		for(int i=0 ; i<a.length() ; i++) {
			char a_char = a.charAt(i);
			if (a_char == ' ') { //check for space between 2 numbers
				n[count] = temp;
				temp = 0;
				count = count+1;
			} else {
				char b_char = a.charAt(i+1); //read next digit
				int x = Character.getNumericValue(a_char);
				int y = Character.getNumericValue(b_char);
				temp = 10*x + y;
				i = i+1; //skip one digit
			}
		}
	}
	
	static void processLine(int[] a, int r, int c) {
		long value = 1;
		for(int x=0 ; x<=r-num ; x++) {
			for(int y=1 ; y<=c ; y++) {
				for(int i=0 ; i<num ; i++) value = value * a[x*c+y+i*r];
				compare(value);
				value = 1;
			}
		}
	}
	
	static void compare(long a) {
		if( a > largest) largest = a;
	}

	static void rotateTable(int r, int c) {
		int i = 1;
		for(int x = 1 ; x<=r ; x++) {
			for(int y = 0 ; y<c ; y++) {
				nr[i] = n[c*y + x];
				i = i+1;
			}
		}
	}
	
	static void inverseTable(int r, int c) {
		int i = 1;
		for(int x = 0 ; x<r ; x++) {
			for(int y = c ; y>0 ; y--) {
				ni[i] = n[x*c + y];
				i = i+1;
			}
		}
	}
	
	static void processDiagonal(int[] a, int r, int c) {
		long value = 1;
		for(int x=0 ; x <= r-num; x++) {
			for(int y=1 ; y <= c-num+1 ; y++) {
				for(int b=0 ; b<num ; b++) value = value * a[x*r + y + b*c + b];
				compare(value);
				value = 1;
			}
		}
	}
}