import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ki tu bat ki: ");
		String hihi = sc.nextLine();
        System.out.print("Nhap vao vi tri can lay ki tu: ");
		int k = sc.nextInt();
		char answers = hihi.charAt(k-1); // nếu dùng charAt thì kiểu dữ liệu char
		System.out.print(answers);
        sc.close();
	}
}