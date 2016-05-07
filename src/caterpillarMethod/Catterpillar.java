package caterpillarMethod;

public class Catterpillar {
	
	public boolean solution(int[] array, int result){
		int front = 0;
		int total = 0;
		
		for (int i = 0; i < array.length; i++){
			while(front < array.length && total + array[front] <= result){
				total += array[front];
				front += 1;
				
				if (total == result){
					return true;
				}				
			}
			total -= array[i];
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {6,2,7,4,1,3,6};
		
		System.out.println(new Catterpillar().solution(array, 12));
	}

}
