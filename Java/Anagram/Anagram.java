import java.util.Arrays;

public class Anagram {
	
	public static Boolean isAnagram(String data1, String data2) {
		
		char[] word1 = data1.toCharArray();
		char[] word2 = data2.toCharArray();
		int wordsLength = 0;
		int count = 0 ;
		
		if(word1.length == word2.length) {
		
		wordsLength = word1.length;
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		for(int i = 0; i < word1.length; i++) {
			
//			System.out.println(word1[i] + " " + word2[i]);
			
			if(word1[i] == word2[i]) {
				count++;
			}
		}
		
		if(count == wordsLength) {
			return true;
		}
		else {
			return false;
		}
	}
		else {
			return false;
		}
		
	}
	
	public static void main(String args[]) {
		
		System.out.println(isAnagram("mary","army"));
		System.out.println(isAnagram("king","army"));
		System.out.println(isAnagram("rail safety","fairy tales"));
		System.out.println(isAnagram("Coronavirus","Carnivorous"));
		
		
	}

}
