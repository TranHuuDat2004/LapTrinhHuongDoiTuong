package lab1;

import java.util.Scanner;

public class Exercise13 {
	public static int reverseNumber(int number) {
		int result = 0;
		while (number != 0) {
			int remainder = number % 10;
			result = result * 10 + remainder;
			number = number / 10;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int number = sc.nextInt();
		int reverseNumber = reverseNumber(number);
		System.out.println("Reverse Number: " + reverseNumber);
		if (number == reverseNumber) {
			System.out.println("Input Number is a palindrome!");
		} else {
			System.out.println("Input Number is not a palindrome!");
		}
		sc.close();
	}
}
