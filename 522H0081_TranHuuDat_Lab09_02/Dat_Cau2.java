import java.io.*;
import java.util.*;
public class Dat_Cau2 {

    public static void main(String[] args) {
        try {
            File f = new File("input_Cau2.txt");
            Scanner sc = new Scanner(f);
            FileWriter wf = new FileWriter("Output_Cau2.txt");
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                wf.write(s.toUpperCase() + "\n");
                // System.out.println(s);
            }
            System.out.println("Tao file output thanh cong.");
            wf.close();
            sc.close();
        }
        catch (IOException e) {
            System.out.println("Da xay ra loi khi ghi tep.");            
        }
    }

}

