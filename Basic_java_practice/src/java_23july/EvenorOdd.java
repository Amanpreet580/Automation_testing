package java_23july;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = input.nextInt();
		
		
		if(num%2 == 0) {
			System.out.println("this is even number");
		}else {
			System.out.println("this is odd number");
		}
		input.close();
	}

}
