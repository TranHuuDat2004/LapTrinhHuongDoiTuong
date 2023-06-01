import java.io.*;
import java.util.*;
public class Dat_Cau5 {

    public static void main(String[] args) {
        try {
            // Open input.txt file
            FileInputStream input = new FileInputStream("input_Cau5.txt");
            Scanner reader = new Scanner(new InputStreamReader(input));

            // Create output.txt file
            FileWriter output = new FileWriter("output_Cau5.txt");            

            // Read each line from input.txt            
            while (reader.hasNextInt()) {
                String data = reader.nextLine();
                System.out.println(data);
                }
            
            int []a = {0,12, 8, 4, 6, 100, 1, 9};
            int kq = 0;

            for (int i = 0; i<a.length; i++){
                kq += a[i];
            }

            System.out.println(kq);                 
            output.write("Ket qua la: "+kq);
            // Close files
            reader.close();
            output.close();

            System.out.println("Da tao file output thanh cong.");
        }
        catch (IOException e) {
            System.out.println("Da xay ra loi khi ghi tep.");
            e.printStackTrace();
        }
    }

}


