import java.io.*;
public class Dat_Cau3 {
    public static void main(String[] args) {        
        Dat_Student s1 = new Dat_Student("Dat", 2004, 1001, 7.97);
        Dat_Student s2 = new Dat_Student("Vinh", 2000, 1002, 9.9);
        try {
            // Create output.txt file
            FileWriter output = new FileWriter("Output_Student.txt");            
            output.write(s1.toString() + "\n");            
            output.write(s2.toString()+ "\n");
            
            // Close files
            
            output.close();

            System.out.println("Da tao file output thanh cong.");
        }
        catch (IOException e) {
            System.out.println("Da xay ra loi khi ghi tep.");
            e.printStackTrace();
        }
    }
}
