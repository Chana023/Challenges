
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Rules:
// IPaddress is a string in the form A.B.C.D
// A,B,C,D can be values in the range 0-255
// Leading zeros are allowed
// The length of A,B,C or D can't be greater than 3

public class MyRegex {
	
	public static boolean isIPAddress(String str) {
		
		Pattern p = Pattern.compile("([0-2][0-5][0-5]|[0-9][0-9]|[0-9])\\.{1}([0-2][0-5][0-5]|[0-9][0-9]|[0-9])\\.{1}([0-2][0-5][0-5]|[0-9][0-9]|[0-9])\\.{1}([0-2][0-5][0-5]|[0-9][0-9]|[0-9])");
		Matcher m = p.matcher(str);
		boolean b = m.matches();
		
		if(b == true) {
		return true;
		}
		else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println(isIPAddress("000.12.12.034")); // true
		System.out.println(isIPAddress("121.234.12.12")); // true
		System.out.println(isIPAddress("23.45.12.56")); //true
		System.out.println(isIPAddress("00.12.123.123123.123")); //false
		System.out.println(isIPAddress("122.23")); //false
		System.out.println(isIPAddress("Hello.IP")); //false
		
		System.out.println("Extra false cases: ");
		
		System.out.println(isIPAddress("000.12.234.23.23")); // false
		System.out.println(isIPAddress("666.666.23.23")); // false
		System.out.println(isIPAddress(".213.123.23.32")); //false
		System.out.println(isIPAddress("23.45.22.32.")); //false
		System.out.println(isIPAddress("I.Am.not.an.ip")); //false
		
		
		

	}

}
