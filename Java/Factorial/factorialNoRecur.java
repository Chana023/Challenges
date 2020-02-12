import java.util.*;


public class factorialNoRecur {
	
	public static int factorial(int inputInt) {
		if(inputInt == 0 || inputInt == 1) {
			return 1;
		}
		else {
			int factorial = 1;
			
			for(int i = 1; i < inputInt + 1; i++) {
				factorial = factorial * i;
				
			}
			return factorial;
			
		}
		
	}

	public static void main(String[] args) {
		try (Scanner data = new Scanner(System.in)) {
			int value = data.nextInt();
			
			int result = factorial(value);
			System.out.println(result);
		}
		
		

	}

}
