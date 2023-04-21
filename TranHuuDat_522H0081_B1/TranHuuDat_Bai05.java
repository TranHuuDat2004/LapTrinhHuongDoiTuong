import java.util.Scanner;
public class TranHuuDat_Bai05{
	public static void leap_year(int year){
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println("Do la nam nhuan");
			
		else 
			System.out.println("Do khong phai la nam nhuan");
	
	}
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao nam can kiem tra: ");
		int year = sc.nextInt();
		leap_year(year);
		sc.close();
	}
}