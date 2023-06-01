import java.util.*;
public class Dat_Cau1 {
    public static void main(String[] args) throws NumberOutOfRangeException{
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so a:");
        a = sc.nextInt();
        System.out.println("Nhap vao so b:");
        b = sc.nextInt();
        Dat_Calculator test = new Dat_Calculator();
        try{
            System.out.println("Thuong la: " + test.divide(a, b));
            System.out.println("Tich la: " + test.multiply(a, b));
        }

        catch(ArithmeticException e){ // loi nho de dau tien
            System.out.println(e);
        } // new error ten bien la e

        catch(NumberOutOfRangeException ne){
            System.out.println(ne);
        }
        sc.close();
    }

        
}

