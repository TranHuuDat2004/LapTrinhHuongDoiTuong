import java.util.Scanner;
public class TranHuuDat_Bai09{
	public static void hailstone(int n){
		while (n>1){
			
			if(n%2==0){
				System.out.println(n + " is even, so we take n/2. ");
				n = n / 2;
			}
				
				
			else{
				System.out.println(n + " is odd, so we take 3*n+1. ");
				n = n*3 + 1;
			}
				
		}
		System.out.println(n + " ");
		
	}
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao so nguyen: ");
		int n = sc.nextInt();
		hailstone(n);
		sc.close();
	}
}
		