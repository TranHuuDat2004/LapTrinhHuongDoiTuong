import java.util.Scanner;
public class MyFirstProgram {
	public static void main(String[] args) {

		//vd1
		System.out.println("Hello World");

		//vd2
		int a = 5, b = 10;
		int sum = a + b;
		System.out.println("a + b = " + sum);

		//vd3
		int i = 1, tong = 0;
		while (i <= 10) {
			tong = tong + i;
			i++;
		}
		System.out.println("sum = " + tong);
	
		//vd4
		int sum_vd4 = 0;
		for (i = 1; i <= 10; i++) {
			sum_vd4 += i; // Same sum = sum + i
		}
		System.out.println("sum = " + sum_vd4);

		//vd5
		i = 0; int sum_vd5 = 0;
		do {
			sum_vd5 = sum_vd5 + i;
			i++;
		} while (i <= 10);
		System.out.println("sum = " + sum_vd5);

		//vd6
		int x = 11;
		if (x % 2 == 0) 
			System.out.println("x is even");
		
		else 
			System.out.println("x is odd");
		
		//vd7
		x = 11;
		int y = 12;
		if (x < y && x + y >= 10) 
			System.out.println("True");
		
		else 
			System.out.println("False");

		//vd8
		Scanner sc = new Scanner(System.in); 	// Create a Scanner object
		String name = sc.nextLine(); 	// Read user input
		int age = sc.nextInt();
		System.out.println("Name: " + name); 	// Output user input
		System.out.println("Age: " + age);
		
		sc.close();
	}
}