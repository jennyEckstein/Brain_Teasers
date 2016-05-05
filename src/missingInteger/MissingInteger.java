package missingInteger;

import java.util.Arrays;

public class MissingInteger {
	
	public int solution(int [] array){
		
		Arrays.sort(array);
		
		if(array.length == 1){
			return array[0];
		}
		
		for (int i = 0; i < array.length; i++){
			if(array[i] > 0){
				if((array[i+1] - array[i]) > 1){
					return array[i] + 1;
				}
			}
		}
		return 1;
	}
}
