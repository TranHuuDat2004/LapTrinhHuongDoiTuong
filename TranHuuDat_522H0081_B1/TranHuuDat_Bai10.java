import java.util.Scanner;
public class TranHuuDat_Bai10{
	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) { // check if number is negative
			return -1;
		}
		
		int lastDigit = number % 10;
		int firstDigit = 0;
		
		while (number != 0) {
			firstDigit = number % 10;
			number /= 10;
		}
		
		return firstDigit + lastDigit;
	}
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao so nguyen: ");
		int n = sc.nextInt();
		int kq = sumFirstAndLastDigit(n);
		System.out.println("Ket qua la: " + kq);
		sc.close();
	}
}
		