package day5assignments;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the character: ");
		Scanner sc = new Scanner(System.in);
		char str = sc.next().charAt(0);
		if(str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u') {
			System.out.println("It is a vowel!!!");
		}
		else {
			System.out.println("It is a consonant!!!");
		}
	}

}
