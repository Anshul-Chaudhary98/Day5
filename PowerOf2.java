package day5assignments;
import java.util.*;
public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 0,storedvalue = 1;
		System.out.print("Enter the power");
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		for(int i=0;i<=value;i++) {	
			System.out.println("2^"+ i + " = " + storedvalue);
			storedvalue = (2*storedvalue);
		}
	}

}
