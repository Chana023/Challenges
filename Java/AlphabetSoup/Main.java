import java.util.*;
import java.util.Arrays;

public class Main {
	
	public static String AlphabetSoup(String str) {
		char[] charArr = new char[str.length()];
		
		for(int i=0; i < str.length();i++) {
			charArr[i] = str.charAt(i);
		}
		
		Arrays.sort(charArr);
		String sorted = ""; 
		
		for(int j=0; j < str.length();j++) {
			sorted = sorted + charArr[j];
		}	
		return sorted;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		
		String result = AlphabetSoup(data);
		System.out.println(result);

	}
}


