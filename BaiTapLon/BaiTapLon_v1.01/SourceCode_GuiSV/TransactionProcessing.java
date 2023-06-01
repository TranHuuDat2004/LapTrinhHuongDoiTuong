import java.util.*;
import java.io.*;

public class TransactionProcessing {
    private ArrayList<Payment> paymentObjects;
    private IDCardManagement idcm;
    
    public TransactionProcessing(String idCardPath, String paymentPath) {
        idcm = new IDCardManagement(idCardPath);
        readPaymentObject(paymentPath);
    
    }

    public ArrayList<Payment> getPaymentObject() {
        return this.paymentObjects;
    }

    // Requirement 3
    public boolean readPaymentObject(String path) {
        paymentObjects = new ArrayList<>(); // Khoi tao danh sach paymentObjects.
    
        try {
            File file = new File(path); // Tao doi tuong File tu duong dan path
            Scanner scanner = new Scanner(file); // Tao doi tuong Scanner de doc FIle
    
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // Doc dong tiep theo
    
                String[] parts = line.split(","); // Tach cac thong tin
    
                if (parts.length == 1) {
                    int id = Integer.parseInt(parts[0]);
    
                    if (parts[0].length() == 6) {
                        // Lop IDCard hoac EWallet.
                        if (id >= 100000 && id <= 999999) {
                            // Tai khoan ConvenientCard
                            IDCard idCard = new IDCard();
                            idCard.setIdNumber(id);
                            ConvenientCard convenientCard = new ConvenientCard(idCard);
                            System.out.println(convenientCard);
                            paymentObjects.add(convenientCard);
                        } else if (id >= 1000000 && id <= 9999999) {
                            // Tai khoan EWallet.
                            EWallet ewallet = new EWallet(id);
                            System.out.println(ewallet);
                            paymentObjects.add(ewallet);
                        }
                    }
                } else if (parts.length == 2) {
                    if (parts[0].length() == 6 && parts[1].length() == 8) {
                        // Tai khoan BankAccount.
                        int accountNumber = Integer.parseInt(parts[0]);                        
                        double interestRate = Double.parseDouble(parts[1].substring(6));
                        BankAccount bankAccount = new BankAccount(accountNumber, interestRate);
                        System.out.println(bankAccount);
                        paymentObjects.add(bankAccount);
                    }
                } 
            }
    
            scanner.close(); // Dong Scanner sau khi doc xong
            
            return true; // Tra ve True neu doc file thanh cong
        } catch (FileNotFoundException e) {
            System.out.println("File not found."); // Bat ngoai le FileNotFoundException.
        } catch (CannotCreateCard e) {
            System.out.println("CannotCreateCard.");
            e.printStackTrace();
        } 
    
        return false; // Tra ve false neu that bai
    }
    
    // Method to print the paymentObjects in the desired format
    public void printPaymentObjects(String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            for (Payment payment : paymentObjects) {
                String paymentString = "";
                if (payment instanceof ConvenientCard) {
                    ConvenientCard card = (ConvenientCard) payment;
                    paymentString = card.getIdCard().getIdNumber() + ",6 digits";
                } else if (payment instanceof EWallet) {
                    EWallet wallet = (EWallet) payment;
                    paymentString = wallet.getIdCard().getIdNumber() + ",7 digits";
                } else if (payment instanceof BankAccount) {
                    BankAccount account = (BankAccount) payment;
                    paymentString = account.getIdCard().getIdNumber() + "," + account.getInterestRate();
                }
                System.out.println(paymentString);
                writer.write(paymentString);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }


    // Requirement 4
    public ArrayList<ConvenientCard> getAdultConvenientCards() {
        //code here
        return null;
    }

    // Requirement 5
    public ArrayList<IDCard> getCustomersHaveBoth() {
        //code here
        return null;
    }

    // Requirement 6
    public void processTopUp(String path) {
        //code here
    }

    // Requirement 7
    public ArrayList<Bill> getUnsuccessfulTransactions(String path) {
        //code here
        return null;
    }

    // Requirement 8
    public ArrayList<BankAccount> getLargestPaymentByBA(String path) {
        //code here
        return null;
    }

    //Requirement 9
    public void processTransactionWithDiscount(String path) {
        //code here
    }
}
