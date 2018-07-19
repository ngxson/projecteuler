package com.ngxson;

class Utils {
    public static void p(Object ob){
        System.out.print(ob);
    }
    
    public static void pln(Object ob){
        System.out.println(ob);
    }
    
	public static int getPrimeNumber(int term) {
		int count = 1;
		int i;
			for(i=2; count <= term; i++)
				if(isPrime(i)) count = count + 1;
		return (i - 1);
	}
	
	public static Boolean isPrime(int i) {
		int maxDiv = (int) Math.sqrt((double)i);
		for(int div = 2; div <= maxDiv; div++)
			if(i % div == 0) return false;
		return true;
	}
}