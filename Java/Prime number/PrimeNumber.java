import java.util.*;

public class PrimeNumber {
	
	public static Boolean checKPrime(int x) {
		
		if(x <= 1) {
			return false;
		}
		
		int result = 0;
		for(int i = 2 ; i < x ; i++) {
			
			result = x % i;
			if(result == 0) {
				return false;
			}
			
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		while(true) {
			
			Scanner input = new Scanner(System.in);
			int data = input.nextInt();
			System.out.println(checKPrime(data));
			
		}
		

		
//		System.out.println(checKPrime(4));	//false
//		System.out.println(checKPrime(20)); //false
//		System.out.println(checKPrime(2));  //true
//		System.out.println(checKPrime(3));  //true
//		System.out.println(checKPrime(5));	//true
//		System.out.println(checKPrime(7));	//true
//		System.out.println(checKPrime(10));	//false

	}

}
