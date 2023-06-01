// To test out Fraction class
import java.util.*;
public class Test_TranHuuDat_Fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st fraction: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        TranHuuDat_FractionI f1 = new TranHuuDat_Fraction(a, b);
        System.out.print("Enter 2nd fraction: ");
        a = sc.nextInt();
        b = sc.nextInt();
        TranHuuDat_FractionI f2 = new TranHuuDat_Fraction(a, b);
        System.out.println("1st fraction is " + f1);
        System.out.println("2nd fraction is " + f2);

        if (f1.equals(f2)) 
            System.out.println("The fractions are the same.");
        else
            System.out.println("The fractions are not the same.");

        TranHuuDat_FractionI sum = f1.add(f2);
        System.out.println("Sum is " + sum);
        TranHuuDat_FractionI diff = f1.minus(f2);
        System.out.println("Difference is " + diff);
        TranHuuDat_FractionI prod = f1.times(f2);
        System.out.println("Product is " + prod);
        sc.close();
    }
}

