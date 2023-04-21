import java.util.Scanner;
public class TranHuuDat_Bai11{
	public static int countDigits(int number) {
		int count = 0;
		
		while (number != 0) {
			count++;
			number /= 10;
		}
		
		return count;
	}
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao so nguyen: ");
		int n = sc.nextInt();
		int kq = countDigits(n);
		System.out.println("Co tat ca la " + kq + " chu so");
		sc.close();
	}
}
		