package hiredTasks;

public class Solution {
	
/*	public int solution(String s){
		
		char [] letter  = s.toCharArray();
		
		int countWords = 0;
		int currentMostWords = 0;
		for (int i = 0; i < letter.length; i++){
			
			if (letter[i] != '.' && letter[i] != '?' && letter[i] != '!'){
				if (letter[i] == ' '){
					countWords++;
				}
			}else{
				if (currentMostWords < countWords){
					currentMostWords= countWords;
				}
				countWords = 0;
			}
		}
		
		return currentMostWords;
	}
*/
	
	public int solution(int from, int to){
		
		//int difference = to - from;
		int counter = 0;
		for (int i = to; i >= from; i--){
			
			double result = Math.sqrt(i);
			if (result%1 == 0){
				if (i >= from && i <= to){
					counter++;
				}
			}
		}
		
		return counter;
	}
	
	public static void main (String [] args){
		
		System.out.println(new Solution().solution(4,17));
	}
}
