package lab1;

import java.util.Scanner;

public class Exercise11 {
	public static int CountNumberOfDigits(int number) {
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int number = sc.nextInt();
		int count = CountNumberOfDigits(number);
		System.out.println("The number of digits: " + count);
		sc.close();
	}
}
