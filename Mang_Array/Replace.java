import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
        System.out.println("Chuong trinh loai bo so trong chuoi");
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ki: ");
		String s = sc.nextLine();
		for(char c = '0'; c <= '9';c++) {
			s = s.replace(c + "", "");
		}
		System.out.println(s);
        sc.close();
	}

}
