import java.util.Scanner;
public class TranHuuDat_Bai08{
	public static double caue(int n){
		int sum = 0;
		for ( int i = 0; i<=n; i++){
			sum = sum + i*i;
		}
		return sum;	
		
	}
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao so nguyen: ");
		int n = sc.nextInt();
		double caue = caue(n);
		System.out.println("Ket qua cau e: " + caue);
		sc.close();
	}
}
		