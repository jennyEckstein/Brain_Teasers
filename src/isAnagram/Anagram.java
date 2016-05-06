package isAnagram;

public class Anagram {
	
	public boolean isAnagram(String str1, String str2){
		
		if(str1 == null || str2 == null){
			return false;
		}
		
		if(str1.length() != str2.length()){
			return false;
		}
		
		char[] chars = str1.toCharArray();
		
		for (char c: chars){
			int index = str2.indexOf(c);
			
			if (index != -1){
				//System.out.println(str2.substring(0, index) + "+"+ str2.substring(index + 1, str2.length()));
				str2 = str2.substring(0, index) + str2.substring(index + 1, str2.length());
			}else{
				return false;
			}
		}
		
		return str2.isEmpty();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Anagram anagram = new Anagram();
		System.out.println(anagram.isAnagram("twelve plus one", "eleven plus two"));
		
		System.out.println(anagram.isAnagram("word", "wrdo"));
		System.out.println(anagram.isAnagram("worfd", "hwrdo"));
		System.out.println(anagram.isAnagram(null, null));
	}

}
