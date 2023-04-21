package lab1;

import java.util.Scanner;

public class Exercise9 {
	public static void HailstoneNumbers(int number) {
		while (number != 1) {
			if (number % 2 == 0) {
				System.out.println(number + " is even, so we take half: " + number / 2);
				number /= 2;
			} else {
				System.out.println(number + " is odd, so we take 3n + 1: " + (number * 3 + 1));
				number = number * 3 + 1;
			}
		}
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = sc.nextInt();
		HailstoneNumbers(n);
		sc.close();
	}
}
