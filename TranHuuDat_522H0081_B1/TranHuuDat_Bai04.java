import java.util.Scanner;
public class TranHuuDat_Bai04{
	public static double celsius(double doF){
		double doC = 5.0/9 * (doF - 32);
		return doC;
	}
		
	public static double fahrenheit(double doC){
		double doF = 9.0/5 * doC + 32;
		return doF;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao nhiet do F: ");
		double doF = sc.nextDouble();

		double doC = celsius(doF);
		System.out.println("Do C la: " + doC);

		doF = fahrenheit(doC);
		System.out.println("Do F la: " + doF);
		sc.close();
	}
}