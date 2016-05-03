package frogRiverOne;

import java.util.Arrays;

public class FrogRiverOne {
	
	public int solution(int distance, int[]array){
		
		if (array.length < 1){
			return -1;
		}
		
		int [] spaceCovered = new int[distance];
		for(int j = 0; j < spaceCovered.length; j++){
			spaceCovered[j] = -1;
		}
			
		int counter = 0;
		for(int i = 0; i < array.length; i++){
			if (array[i] <= distance && spaceCovered[array[i]-1] == -1){
				spaceCovered[array[i]-1] = array[i];
				counter++;
			}
			if (counter == spaceCovered.length){
				return i;
			}
		}
		
		return -1;
	}

}
