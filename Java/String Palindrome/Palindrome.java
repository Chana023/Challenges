
public class Palindrome {
	
	public static Boolean isPalinDrome(String str) {
		
		int lengthOfString = str.length();
		char[] stringData = new char[lengthOfString];
		Boolean isPalinDrome = false;
		
		for(int i = 0; i < lengthOfString; i++) {
			
			stringData[i] = str.charAt(i);
		}
		
		for(int j = 0 ; j < lengthOfString ; j++) {
			
			if(stringData[j] == stringData[lengthOfString - j -1]) {
				isPalinDrome =  true;
			}
			else {
				isPalinDrome = false;
			}
		}
		
		return isPalinDrome;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalinDrome("Hello"));  //false
		System.out.println(isPalinDrome("level"));	//true
		System.out.println(isPalinDrome("Level"));	//false
		System.out.println(isPalinDrome("ABBA"));	//true
		System.out.println(isPalinDrome("CCBBAA"));	//false
		System.out.println(isPalinDrome("CBAABC"));	//true
		
		
	}

}
