package primeNumbers;

import java.util.*;

public class PrimeNumbers {
	
	public boolean[] solution(int number){
		
		boolean[] prime = new boolean[number + 1];
		Arrays.fill(prime, true);
		
		prime[0] = false;
		prime[1] = false;
		int m = (int) Math.sqrt(number);
		
		for (int i = 2; i <= m; i++){
			if(prime[i]){
				for (int k=i*i; k <= number; k += i){
					prime[k] = false;
				}
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean [] array = new PrimeNumbers().solution(10);
		
		for (int i = 0; i < array.length; i++){
			if (array[i]){
				System.out.print (i + ", ");
			}
		}
	}

}
