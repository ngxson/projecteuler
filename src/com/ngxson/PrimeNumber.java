package com.ngxson;

class PrimeNumber {
	public static void main(String[] arg) {
		
	}
	
	public static Boolean isDivisible(double num, double div) {
        double a = num/div;
        double b = (double) ((int) a);
        double odd = a - b;
        if (odd == 0.0) {
        	return true;
        }
        return false;
	}
}