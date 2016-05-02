package frogRiverOne;

import java.util.Arrays;

public class FrogRiverOne {
	
	public int solution(int distance, int[]array){
		
		if (array.length < 1){
			return -1;
		}
		
		for(int i = 0; i < array.length; i++){
			if (array[i] == distance){
				return i;
			}
		}
		
		return -1;
	}

}
