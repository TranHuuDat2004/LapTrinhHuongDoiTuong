package lab1;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Input number 2: ");
		int num2 = sc.nextInt();
		System.out.println("Input number 3: ");
		int num3 = sc.nextInt();
         
        int smallest = 0;
         
        if(num1 < num2) {
            if(num3 < num1) {
                smallest = num3;
            } else {
                smallest = num1;
            }
        } else {
            if(num2 < num3) {
                smallest = num2;
            } else {
                smallest = num3;
            }
        }
        System.out.println(smallest + " is the smallest.");
        sc.close();
	}
}
