package lab1;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		Scanner sc = new Scanner(System.in);
		System.out.println("Input base: ");
		float base = sc.nextFloat();
		System.out.println("Input height: ");
		float height = sc.nextFloat();
		float area = base * height/2;
		System.out.println("Area is: " + area);
		sc.close();
	}
}
