import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
        System.out.println("Chuong trinh dao nguoc trong chuoi");
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ki: ");
        String s = sc.nextLine();
        
		String answer = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			answer += s.charAt(i);
		}
		System.out.print(answer);
        sc.close();
	}
}