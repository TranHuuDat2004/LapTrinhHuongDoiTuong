import java.io.*;
public class Dat_Cau2 {

    public static void main(String[] args) {
        try {
            // Open input.txt file
            FileInputStream input = new FileInputStream("input_Cau2.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // Create output.txt file
            FileWriter output = new FileWriter("output_Cau2.txt");

            String line;

            // Read each line from input.txt and write the uppercase version to output.txt
            while ((line = reader.readLine()) != null) {
                String uppercaseLine = line.toUpperCase();
                output.write(uppercaseLine + "\n");
            }

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

