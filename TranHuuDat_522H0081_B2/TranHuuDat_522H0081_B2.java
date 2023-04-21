import java.util.Scanner;
import java.math.BigDecimal;
public class TranHuuDat_522H0081_B2{
	public static void menu (){
		System.out.println("\n----------Menu---------");
		System.out.println("1. Tim phan tu lon nhat");
		System.out.println("2. Tim phan tu nho nhat");
		System.out.println("3. Tong cac phan tu chan trong mang");
		System.out.println("4. Tim phan tu lon nhat");
		System.out.println("5. Dem so luong cua so nguyen to cua mang");
		System.out.println("6. Tim kiem phan tu");
		System.out.println("7. Binh phuong cac phan tu cua mang");
		System.out.println("8. Tim phan tu lon nhat");
		System.out.println("9. Tim phan tu lon nhat");
		System.out.println("10. Tim phan tu lon nhat");
		System.out.println("0. Thoat chuong trinh");		
	}

	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao so luong mang: ");
		int n = sc.nextInt();
		int [] a = new int[n];
		nhapmang(a, n);
		xuatmang(a, n);
		menu();
		int luachon = 0;
		int thoat = 0;
		int kq = 0;
		while (true){
			System.out.println("\nNhap vao su lua chon cua ban: ");
			luachon = sc.nextInt();
			switch(luachon){
				case 1:
					kq = findMax(a, n);
					System.out.println("Gia tri lon nhat la: " + kq);
					break;
				case 2:
					kq = findMin(a, n);
					System.out.println("Gia tri nho nhat la: " + kq);
					break;
				case 3:
					kq = sumEven(a, n);
					System.out.println("Tong gia tri chan la: " + kq);
					break;
				case 4:
					break;
				case 5:
					kq = checkPrime(a, n);
					System.out.println("Co tong cong " + kq + " so nguyen to");
					break;
				case 6:
					System.out.println("Nhap vao gia tri can tim: ");
					int k = sc.nextInt();	
					kq = find(a,n,k);
					if (kq == -1)
						System.out.println("Phan tu khong tim thay");
					else
						System.out.println("Phan tu tim thay o vi tri : " + kq);
					break;
				case 7:
					square(a, n);
					xuatmangbai7(a, n);
					break;
				
				case 0:
					System.out.println("Da thoat chuong trinh");
					thoat = 1;
					break;	
				default:
					System.out.println("Ban da nhap sai vui long nhap lai");
					break;
	
			}
			if(thoat == 1) break;
		} 

		
	
	}
	
	public static void nhapmang(int a[], int n){
		Scanner sc = new Scanner (System.in);
		for(int i=0; i<n; i++){
			System.out.println("Nhap vao phan tu mang thu "+ i + " :");
			a[i] = sc.nextInt();		
		}
	}

	public static void xuatmang(int a[], int n){
		System.out.println("Cac phan tu cua mang la: ");
		for(int i=0; i<n; i++){
			System.out.print(" "+ a[i]);		
		}
	}

	public static void xuatmangbai7(int a[], int n){
		System.out.println("Cac phan tu cua mang sau khi binh phuong la: ");
		for(int i=0; i<n; i++){
			System.out.print(" "+ a[i]);		
		}
	}

	public static int findMax(int a[], int n){
		int max = a[0];
		for(int i=0; i<n; i++){
			if(max<a[i])
				max = a[i];
		}
		return max;
	}

	public static int findMin(int a[], int n){
		int min = a[0];
		for(int i=0; i<n; i++){
			if(min>a[i])
				min = a[i];
		}
		return min;
	}

	public static int sumEven(int a[], int n){
		int sum = 0;
		System.out.println("Cac phan tu chan cua mang la: ");
		for(int i=0; i<n; i++){
			if(a[i]%2==0)
				sum += a[i];				
		}
		return sum;
	}
	public static int find(int a[], int n, int k){
		int tim = -1;
		for(int i=0; i<n; i++){
			if(a[i]==k){	
				tim = i;	
				break;				
			}
			

		}
		return tim;
		
	}
	public static void square(int a[], int n){
		for(int i=0; i<n; i++){
			a[i] = a[i] * a[i];
		}
	}
	public static int checkPrime(int a[], int n) {
		int sum = 0;
        	for(int i=0;i<n;i++){
			for (int m=2; m<=(a[i])/2; m++){
            			if(a[i] % m == 0)
					break;
			}
					sum ++ ;
						
				
            	}
                return sum;
        }

		
}
		