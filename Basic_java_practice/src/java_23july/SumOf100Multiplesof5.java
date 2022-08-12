package java_23july;

public class SumOf100Multiplesof5 {

	public static void main(String[] args) {
		// print sum of first 100 multiples of 5
		

		int sum = 0;
		for(int i = 1; i <= 100; i++ ) {
			sum += (5*i);
			
		}
		System.out.println("sum of first 100 multiples of 5: " + sum);
	}

}
