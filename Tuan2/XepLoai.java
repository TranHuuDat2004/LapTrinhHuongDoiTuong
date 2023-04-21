import java.util.Scanner;

public class XepLoai{
    // function 1
    public static void xetdiem (double diemtb){
        if ((diemtb >= 8) && (diemtb)<10)
            System.out.println("Hang A");
        else if ((diemtb >= 5) && (diemtb)<8)
            System.out.println("Hang B");
        else
            System.out.println("Hang C");
    }

    // function 2
    public static double diemTB (double toan, double van, double anh){
        double diemtb = (toan*2 + van + anh)/4;
        System.out.println("Diem TB: " + diemtb);
        return diemtb;
    }

    public static void main (String[] args){
        double toan, van, anh, diemtb;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap diem toan: ");
        toan = sc.nextInt();
        System.out.println("Nhap diem van: ");
        van = sc.nextInt();
        System.out.println("Nhap diem anh: ");
        anh = sc.nextInt();

        diemtb = diemTB(toan, van, anh);
        xetdiem(diemtb);



    }
}