package math;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * 
		 */
		for (int i= 2;i<100000;i++){
			if(isPrime(i))
				System.out.print(i + ", ");
		}
	}

	public static boolean isPrime(int n) {
		//check if n is a multiple of 2
		if(n ==2) return  true;
		if (n%2==0) return false;
		//if not, then just check the odds
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
