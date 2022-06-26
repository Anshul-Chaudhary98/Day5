package day5assignments;

import java.util.Scanner;

public class ComputeQandR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divident = 0, divisor = 0, quotient = 0, remainder = 0;
		
		System.out.print("Enter the Divident: ");
		Scanner sc = new Scanner(System.in);
		divident = sc.nextInt();
		
		System.out.print("Enter the Divisor: "); 
		divisor = sc.nextInt();
		
		quotient = divident / divisor;
		System.out.println("Quotient is: " + quotient);
		
		remainder = divident - (divisor*quotient);
		System.out.println("Remainder is: " + remainder);
	}

}
