package frogRiverOne;

import java.util.Arrays;

public class FrogRiverOne {
	
	public int solution(int distance, int[]array){
		
		if (array.length <= 1){
			return -1;
		}
		
		for(int i = 0; i < array.length; i++){
			if (array[i] == distance){
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,3,1,4,2,3,5,4};
		int distance = 5;
		
		FrogRiverOne frogRiverOne = new FrogRiverOne();
		int result = frogRiverOne.solution(distance, array);
		
		System.out.println(result);
	}

}
