package com.ngxson;

class Q5SmallestMultiple {
	public static int num = 10;
	
	public static void main(String[] arg) {
		int a = 1;
		Boolean right = false;
		while(!right) {
			a = a+1;
		}
	}
	
	public static Boolean divByAll(int a) {
		for(int i=1 ; i <= num ; i++) {
			if(a % i == 0) {
				return true;
			}
		}
		return false;
	}
}