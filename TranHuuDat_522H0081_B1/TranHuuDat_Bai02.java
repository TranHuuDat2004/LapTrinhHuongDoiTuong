import java.util.Scanner;
public class TranHuuDat_Bai02{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);

		System.out.println("Nhap vao day tam giac: ");
		int base = sc.nextInt();
		System.out.println("Nhap vao chieu cao: ");
		int height = sc.nextInt();
		
		double area = 1.0/2 * base * height;
		System.out.println("Dien tich hinh tam giac la: " + area);
		sc.close();
	}
}