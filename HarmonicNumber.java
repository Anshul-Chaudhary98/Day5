package day5assignments;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 0;
		float storedvalue = 0;
		System.out.print("Enter range till where you want to print harmonic numbers: ");		
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		for(float i=1;i<=value;i++) {		
			storedvalue =storedvalue + 1/i ;	
			System.out.println(""+storedvalue);
		}
	}

}
