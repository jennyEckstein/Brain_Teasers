package isAnagram;

public class Anagram {
	
	public boolean isAnagram(String str1, String str2){
		
		if(str1 == null || str2 == null){
			return false;
		}
		
		if((str1.length() != str2.length()) || str1 == null || str2 == null){
			return false;
		}
		
		char[] chars = str1.toCharArray();
		
		for (char c: chars){
			int index = str2.indexOf(c);
			
			if (index != -1){
				str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
			}else{
				return false;
			}
		}
		
		return str2.isEmpty();
	}
}
