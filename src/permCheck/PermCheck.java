package permCheck;

import java.util.Arrays;

public class PermCheck {
	
	public int solution(int [] array){
		
		Arrays.sort(array);
		
		for (int i = 1; i < array.length; i++){
			if ((array[i] - array[i-1]) > 1){
				return 0;
			}
		}
		return 1;
	}

	public static void main (String [] args){
		
		//int [] array = {4,1,3,2};
		int [] array = {4,1,3};
		PermCheck permCheck = new PermCheck();
		
		int result = permCheck.solution(array);
		
		System.out.println(result);
	}
}
