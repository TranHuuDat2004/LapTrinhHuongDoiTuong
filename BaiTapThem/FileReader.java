import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
    private int idNumber;
    private String fullName;
    private String gender;
    private String dateOfBirth;
    private String address;
    private int phoneNumber;

    public void readDataFromFile(String filePath) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                if (parts.length >= 7) {
                    idNumber = Integer.parseInt(parts[0]);
                    fullName = parts[1];
                    gender = parts[2];
                    dateOfBirth = parts[3];
                    address = parts[4];
                    phoneNumber = Integer.parseInt(parts[5]);

                    // Perform any desired actions with the data
                    System.out.println("idNumber: " + idNumber);
                    System.out.println("fullName: " + fullName);
                    System.out.println("gender: " + gender);
                    System.out.println("dateOfBirth: " + dateOfBirth);
                    System.out.println("address: " + address);
                    System.out.println("phoneNumber: " + phoneNumber);
                    System.out.println("------------------");
                }
            }            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readDataFromFile("data.txt");
    }
}
