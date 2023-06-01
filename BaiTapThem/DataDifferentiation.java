public class DataDifferentiation {
    public static void main(String[] args) {
        String data1 = "123456";   // Dữ liệu 6 số
        String data2 = "7890123";  // Dữ liệu 7 số
        String data3 = "12345A";   // Dữ liệu không phải số
        
        differentiateData(data1);
        differentiateData(data2);
        differentiateData(data3);
    }
    
    public static void differentiateData(String data) {
        int length = data.length();
        
        if (length == 6) {
            System.out.println(data + " la du lieu co 6 so.");
        } else if (length == 7 && data.matches("\\d+")) {
            System.out.println(data + " la du lieu co 7 so.");
        } else {
            System.out.println(data + " la du lieu khac.");
        }
    }
}
