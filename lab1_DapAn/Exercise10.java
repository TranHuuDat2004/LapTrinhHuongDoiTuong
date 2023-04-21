package lab1;

import java.util.Scanner;

public class Exercise10 {
    public static int firstDigit(int number) {
        while (number >= 10) {
        	number /= 10;
        }
        return number;
    }
 
    public static int lastDigit(int number) {
        return (number % 10);
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int number = sc.nextInt();
		int firstDigit = firstDigit(number);
		int lastDigit = lastDigit(number);
		int total = firstDigit + lastDigit;
		System.out.println("First Digit: " + firstDigit);
		System.out.println("Last Digit: " + lastDigit);
		System.out.println("Total of Last Digit and First Digit: " + total);
		sc.close();
	}
}
