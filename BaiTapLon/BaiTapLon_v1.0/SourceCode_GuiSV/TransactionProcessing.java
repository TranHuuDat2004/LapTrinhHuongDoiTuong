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
        paymentObjects = new ArrayList<>();
    
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
    
                if (parts.length == 1) {
                    String data = parts[0];
    
                    if (data.length() == 6) {
                        IDCard idCard = new IDCard();
                        idCard.setIdNumber(Integer.parseInt(data));
                        Payment payment = new ConvenientCard(idCard); // Tao Payment tu IDCard
                        paymentObjects.add(payment);
                        System.out.println(payment.toString());
                    } else if (data.length() == 7) {
                        EWallet eWallet = new EWallet();
                        eWallet.setPhoneNumber(data);
                        paymentObjects.add(eWallet);
                        System.out.println(eWallet.toString());
                    }
                } else if (parts.length == 2) {
                    String accountNumber = parts[0];
                    double interestRate = Double.parseDouble(parts[1]);
    
                    BankAccount bankAccount = new BankAccount();
                    bankAccount.setAccountNumber(accountNumber);
                    bankAccount.setInterestRate(interestRate);
    
                    paymentObjects.add(bankAccount);
                    System.out.println(bankAccount.toString());
                }
            }
            
            return true;
        } catch (FileNotFoundException | CannotCreateCard e) {
            System.out.println("File not found: " + path);
            return false;
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
