package day5assignments;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 0, number2 = 0, temp = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		number1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
        number2 = sc.nextInt();
        
        temp = number1;
        number1 = number2;
        number2 = temp;
        
        System.out.println("After Swapping: "+ number1 + " " + number2);
        
	}

}
