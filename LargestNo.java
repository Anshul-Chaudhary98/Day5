package day5assignments;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number1 = 0, number2 = 0, number3 = 0, check = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		number1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
        number2 = sc.nextInt();
        System.out.print("Enter Third Number: ");
        number3 = sc.nextInt();
        
        if(number1 >= number2 && number1 >= number3) {
        	System.out.println("Largest Number is: " + number1);
        }
        else if(number2 >= number1&& number2 >= number3) {
        	System.out.println("Largest Number is: " + number2);
        }
        else {
        	System.out.println("Largest Number is: " + number3);

        }
	}

}
