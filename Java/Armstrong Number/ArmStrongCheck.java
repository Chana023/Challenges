//A number is called an Armstrong number if it is equal to the cube of its every digit. 
//For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. 
//You need to write a program to check if the given number is Armstrong number or not.

//After research an armstrong number is a number where the sum of the digits raised to the pow
//of the number of digits.
public class ArmStrongCheck {
	
	public static Boolean checker(int number) {
		String data = Integer.toString(number);
		char[] numberChar = data.toCharArray();
		
		double sum = 0;
		
		for(int i = 0 ; i < numberChar.length; i++) {
			
			sum = sum + Math.pow((int)Character.getNumericValue(numberChar[i]),numberChar.length);
		}
		
		
		if((int) sum == number) {
			return true;
		}
		
		return false ;
	}
	

	public static void main(String[] args) {
		
		System.out.println(checker(153));  //true
		System.out.println(checker(20));  //false
		System.out.println(checker(370));  //true
		System.out.println(checker(1634));  //true
	}

}
