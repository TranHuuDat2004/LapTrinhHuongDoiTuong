import java.util.Scanner;
public class TranHuuDat_Bai06{
	public static int minimum(int a, int b, int c){
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		System.out.println("Nhap b: ");
		int b = sc.nextInt();
		System.out.println("Nhap c: ");
		int c = sc.nextInt();
		
		int min = minimum (a, b, c);
		System.out.println("So nho nhat la: " + min);
		sc.close();
	}
}