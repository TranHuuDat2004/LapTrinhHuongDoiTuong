import java.util.Scanner;
public class TranHuuDat_Bai07{
	public static boolean isAlpha(char c){
		if (c >= 'A' || c <= 'z'){
			return true;
	}
		else
			return false;
	}

	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao ki tu: ");
		char c = sc.nextLine().charAt(0);
		boolean kq = isAlpha(c);
		if(kq)	
			System.out.println("Do la ki tu");
		else 
			System.out.println("Do khong phai la ki tu");
		sc.close();
	}
}
