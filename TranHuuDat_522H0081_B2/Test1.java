import java.math.BigDecimal;
public class Test1 {
public static void main(String[] args) {
BigDecimal x = new BigDecimal(4);
BigDecimal y = new BigDecimal(4);
System.out.println(x == y);
System.out.println(x.equals(y));
}
}