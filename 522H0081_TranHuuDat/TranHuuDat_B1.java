import java.util.Scanner;
public class TranHuuDat_B1{
	// in ra mang
	public static void print_arr(int [] arr, int n){
		for (int i = 0; i<n; i++){
			System.out.print(arr[i] + " ");			
		}
		System.out.print("\n");		
	}
	public static void main (String[]args){

		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap vao so luong phan tu: ");
		int []arr = new int [100];
		int n = sc.nextInt();
		for (int i = 0; i<n; i++){
			System.out.print("\nA[" + i +"]= ");
			arr[i] = sc.nextInt();			
		}

		System.out.print("Mang ban dau la: ");
		print_arr(arr, n);
		System.out.println("Nhap gia tri can xoa: ");
		int key = sc.nextInt();
		
		//a
		boolean rm = remove(arr, key);
		if (rm == true)
			System.out.println("Xoa thanh cong");
		else if (rm == false)
		System.out.println("Xoa khong thanh cong");
		System.out.print("Mang sau khi xoa la: ");
		print_arr(arr, n);

		//b
		System.out.println("Nhap gia tri can them vao: ");
		int x = sc.nextInt();
		System.out.println("Nhap vao vi tri can them: ");
		int pos = sc.nextInt();
		insert(arr, pos, x);
		System.out.print("Mang sau khi them la: ");
		print_arr(arr, n);

		int []kq = new int [n];
		kq = getDuplicate(arr);
		System.out.print("Cac gia tri trung lap la: ");
		print_arr(kq, (kq.length-1));
		
		
		sc.close();
	}

	
	// xoa phan tu trong mang neu thanh cong tra ve true
	public static boolean remove(int [] arr, int key){
		int pos = -1;
		for (int i = 0; i<arr.length; i++){
			if(arr[i]==key){
				pos = i;
				break;
			}
		}
		// ket thuc for
		if(pos == -1) return false;
		for (int i=pos; i<arr.length-1;i++){
			arr[i] = arr[i+1]; // doi phan tu len dang truoc
		}
		arr[arr.length-1] = 0; // phan tu cuoi cung co gia tri bang 0
		return true;
	}
	
	// them gia tri x tai vi tri cu the pos
	public static void insert(int [] arr, int pos, int x){
		if (pos < 0 || pos >= arr.length){
			System.out.println("Ban da nhap sai vi tri.");		
			return; // thoat chuong trinh neu nhap sai
		}
			
		for (int i = arr.length-1; i>pos; i--){
			arr[i] = arr[i-1]; // doi phan tu ra dang sau			
		}
		arr[pos] = x; // them phan tu moi tai gia tri da cho
	}
	
	// dem so lan xuat hien cua x trong a tu vi tri 0 toi end
	public static int count (int a[], int x, int end){
		int dem = 0; 
		for (int i=0; i<end; i++){
			if (a[i]==x)
			dem++;				
		}
		return dem;				
	}

	// Lay phan tu trung nhau
	public static int [] getDuplicate(int []a){ // tra ve mang
		int dem_phan_tu_trung = 0;
		for (int i = 0; i<a.length;  i++){
			if (count(a, a[i], i)==1) // phan tu trung
				dem_phan_tu_trung++;
		}
		int [] kq = new int [dem_phan_tu_trung];
		int t = 0;
		for (int i = 0; i<a.length; i++){
			if (count(a, a[i], i)==1){// phan tu trung
				kq[t] = a[i];
				t++;
			}
		}
		return kq;
	}
	
}