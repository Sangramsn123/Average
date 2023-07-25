package abcd;

import java.util.Scanner;

public class MaxOfThreeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int n2 = sc.nextInt();
		System.out.println("Enter Number 3 : ");
		int n3 = sc.nextInt();

		if (n1 >= n2 && n1 >= n3) {
			System.out.println("Largest Number = " + n1);
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println("Largest Number = " + n2);
		} else {
			System.out.println("Largest Number = " + n3);
		}

		int avg = (n1+n2+n3)/3;
		System.out.println("Average Of Three Number  = " + avg);
		

	}

}
