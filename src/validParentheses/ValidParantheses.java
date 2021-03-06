package validParentheses;

import java.util.*;

public class ValidParantheses {
	
	public boolean isValid(String str){
		
		if (str == null) { return false;}
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++){
			char currentChar = str.charAt(i);
			
			if(map.keySet().contains(currentChar)){
				stack.push(currentChar);
			}else if(map.values().contains(currentChar)){
				if(!stack.empty() && map.get(stack.peek())==currentChar){
					stack.pop();
				}else{
					return false;
				}
			}
		}
		return stack.empty();
	}
}
