package lab1;

import java.util.Scanner;

public class Exercise8 {
	public static int methodA(int n) {
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			result = result + (i + 1);
		}
		
		return result;
	}
	
	public static int methodB(int n) {
		if (n == 0) {
			return 0;
		}
		int result = 1;
		
		for (int i = 0; i < n; i++) {
			result = result * (i + 1);
		}
		
		return result;
	}
	
	public static double methodC(int n) {
		double result = 0;
		
		for (int i = 0; i <= n; i++) {
			result = result + power(2,i);
		}
		
		return result;
	}
	
	private static double power(double base, double exponent) {
		double result = 1;
		for (int i = 0; i < exponent; i++) {
			result = result * base;
		}
		return result;
	}
	
	public static double methodD(int n) {
		double result = 0;
		
		for (int i = 1; i <= n; i++) {
			double temp = (double)1 / (2*i);
			result = result + temp;
		}
		
		return result;
	}
	
	public static double methodE(int n) {
		double result = 0;

		for (int i = 1; i <= n; i++) {
			result = result + power(i, 2);
		}

		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = sc.nextInt();
		while (n == 0) {
			System.out.println("Please input n as positive!");
			System.out.println("Input n: ");
			n = sc.nextInt();
		}
		
		int resultA = methodA(n);
		System.out.println("Result A: " + resultA);
		
		int resultB = methodB(n);
		System.out.println("Result B: " + resultB);
		
		double resultC = methodC(n);
		System.out.println("Result C: " + resultC);
		
		double resultD = methodD(n);
		System.out.println("Result D: " + resultD);
		
		double resultE = methodE(n);
		System.out.println("Result E: " + resultE);
		sc.close();
	}
}
