package absDistinct;

import java.util.HashMap;

public class AbsDistinct {
	
	public int solution(int [] array){
		
		HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < array.length; i++){
			if(!map.containsKey(Math.abs(array[i]))){
				map.put(Math.abs(array[i]), 0);
			}
		}
		return map.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsDistinct abs = new AbsDistinct();
		int [] array = {-5,-3,-1,0,3,6};
		System.out.println(abs.solution(array));
	}

}
