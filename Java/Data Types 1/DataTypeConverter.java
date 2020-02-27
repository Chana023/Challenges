import java.util.*;

public class DataTypeConverter {
	
	public static double fahrenheitToCelcius(double fahrenheit) {
		
		double celcius = (fahrenheit - 32)*5/9;
		
		return celcius;
	}
	
	public static double inchesToMeters(double inches) {
		double meters = inches / 39.37;
		return meters;
	}
	
	public static int sumDigitsInInteger(int data) {
		
		int sum = 0;
		String number = Integer.toString(data);
		char[] numberCharArr = number.toCharArray();
		
		for(int i = 0; i < numberCharArr.length; i++) {
			int eachChar = Character.getNumericValue(numberCharArr[i]);
			
			sum = sum + eachChar;
		}
		return sum;
	}
	
	public static String minutesToYearsAndDays(int minutes) {
		int years = minutes / 525600;
		int remainingMinutes = minutes % 525600;
		int days = remainingMinutes / 1440;
		
		return "Years " + years + " days: " + days;
		
	}
	
	public static double bmiCalc(double weight, double height) {
		
		double result = 0;
		
		result = weight / (height*height);
		
		return result;
	}

	public static void main(String[] args) {
	
		System.out.println(fahrenheitToCelcius(212));
		System.out.println(inchesToMeters(1000));
		System.out.println(sumDigitsInInteger(555));
		System.out.println(minutesToYearsAndDays(3456789));
		System.out.println(bmiCalc(80.4,1.79));

	}

}
