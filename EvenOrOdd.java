package day5assignments;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		System.out.print("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Number "+ number + " is even");
		}
		else {
			System.out.println("Number "+ number + " is odd");
		}
	}

}
