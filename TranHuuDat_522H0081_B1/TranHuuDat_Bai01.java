import java.util.Scanner;

public class TranHuuDat_Bai01{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);

		System.out.println("Nhap ho va ten: ");
		String name = sc.nextLine();

		System.out.println("Nhap MSSV: ");
		String mssv = sc.nextLine();	

		System.out.println("Nhap nam sinh: ");
		int year = sc.nextInt();		

		System.out.println("Ho va ten: " + name);
		System.out.println("MSSV: " + mssv);	
		System.out.println("Nam sinh: " + year);	
		sc.close();
	}	
}