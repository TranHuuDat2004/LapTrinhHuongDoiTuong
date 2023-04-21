package lab1;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your name: ");
		String name = sc.nextLine();
		System.out.println("Input your birthday: ");
		String birthday = sc.nextLine();
		System.out.println("Input your student id: ");
		String studentId = sc.nextLine();
		
		System.out.println("Name: " + name);
		System.out.println("Birthday: " + birthday);
		System.out.println("Student Id: " + studentId);
		
		sc.close();
	}
}
