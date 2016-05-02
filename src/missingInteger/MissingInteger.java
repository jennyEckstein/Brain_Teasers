package missingInteger;

import java.util.Arrays;

public class MissingInteger {
	
	public int solution(int [] array){
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++){
			if(array[i] > 0){
				if((array[i+1] - array[i]) > 1){
					return array[i] + 1;
				}
			}
		}

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,3,6,4,1,2};
		MissingInteger missingInteger = new MissingInteger();
		int result = missingInteger.solution(array);
		
		System.out.println(result);
	}

}
