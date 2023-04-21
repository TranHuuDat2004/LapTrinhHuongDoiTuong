package lab1;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Input number 2: ");
		int num2 = sc.nextInt();
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("Quotient is: " + quotient);
		System.out.println("Remainder is: " + remainder);
		sc.close();
	}
}
