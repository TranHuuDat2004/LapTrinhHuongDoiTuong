import java.util.Scanner;

public class TranHuuDat_Bai03{
	public static int remainder (int number, int division){
		int temp = number/division;
		int remain = number -( temp * division );
		return remain;
	}
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);

		System.out.println("Nhap vao so bi chia: ");
		int number = sc.nextInt();
		System.out.println("Nhap vao so chia: ");
		int division = sc.nextInt();
		int remainder = remainder(number, division);
		System.out.println("So du la: " + remainder);		
		sc.close();
	}
}