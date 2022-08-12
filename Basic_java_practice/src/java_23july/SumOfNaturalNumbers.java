package java_23july;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// print sum of first 100 natural numbers
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum of first 100 natural numbers is: " + sum);
	}

}
