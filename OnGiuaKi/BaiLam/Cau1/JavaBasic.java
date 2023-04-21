import java.util.Scanner;
public class JavaBasic{
    public static int sumNegativeElements(int a[]){
        int sum =0;
        for(int i = 0; i<=a.length-1;i++)
            if (a[i]<0)
                sum += a[i];
        return sum;
    }

    // public static String uppercaseFirstVowels(String str){
    // }
	
	public static int findMinNegativeElement(int a[]){
        int find = -1;
        int min = a[0];
        for(int i = 0; i<=a.length-1;i++)
            if (a[i]<min){
                min = a[i];
                find = i;
            }
                
        return find;

    }
	
	public static String getName(String str){
        String[] parts = str.split(":"); // bat dau lay chuoi tu (:) tro ve sau
        if (parts.length == 2) { // kiem tra tinh hop le cua chuoi
            return parts[1].trim(); // xoa khoang trang cua chuoi
        } else {
            return "";
        }
    }

    public static int findFirstMod3Element(int[] a){
        int chia = -1;
        for(int i = 0; i<a.length-1; i++){
            if(a[i] %3 == 0)
                chia = i;
        }
        return chia;
    }

    public static int countString(String str, String k){
        int count = 0;
        String[] words = str.split(" "); // tach chuoi lon thanh nhieu chuoi nho
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
        //for (String word : words) { //chay tu phan tu dau den ptu cuoi
            if (word.equalsIgnoreCase(k)) { // bo qua cac ki tu hoa va thuong
                count++;
            }
        }
        return count;       

    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int []a = {1,-2,3,4,-2,1,-9};

        int sum = sumNegativeElements(a);
        int min = findMinNegativeElement(a);
        int chia = findFirstMod3Element(a);

        System.out.println("Ket qua la: "+ sum);
        System.out.println("So am nho nhat o vi tri: "+ min);
        System.out.println("So chia duoc cho 3 o vi tri: " + chia );

        
        
        // String s = "nguyen thi uyen an";
        // String nguyenam = uppercaseFirstVowels(s);
        // System.out.println("Viet hoa nguyen am: "+ nguyenam);

		String s1 = "Ho ten: Nguyen Thi Anh Dao";
		String hoten = getName(s1);
        System.out.println("Ho va ten la: "+ hoten);

        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
        System.out.println("Nhap vao chuoi k: ");
        String k = sc.nextLine();
        int kq2 = countString(s2, k);
        System.out.println("So luong chuoi co trong chuoi k la: "+ kq2);

        sc.close();
    }

}