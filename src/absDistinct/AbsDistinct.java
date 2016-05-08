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
	
	public int solutionCaterpillar(int[] A) {
		int count = 0;
		for (int i = 0, j = A.length - 1, prev = -1; i <= j; ) {
			int left = Math.abs(A[i]), right = Math.abs(A[j]);
			int max = left == Integer.MIN_VALUE ? left : Math.max(left, right);
			if (prev != max) {
				count++;
			}
			prev = max;
			if (left == Integer.MIN_VALUE || right < left) {
				i++;
			} else {
				j--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsDistinct abs = new AbsDistinct();
		int [] array = {-5,-3,-1,0,3,6};
		System.out.println(abs.solution(array));
		System.out.println(abs.solutionCaterpillar(array));
	}

}
