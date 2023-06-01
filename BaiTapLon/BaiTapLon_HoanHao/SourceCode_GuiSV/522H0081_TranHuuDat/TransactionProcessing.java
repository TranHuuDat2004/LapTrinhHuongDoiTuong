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

                    if (parts[0].length() == 6) { // 
                                            
                        // Tai khoan ConvenientCard
                        IDCard idCard = findIDCardById(id, idcm);                            
                        ConvenientCard convenientCard = new ConvenientCard(idCard);
                        System.out.println(convenientCard.toString());
                        paymentObjects.add(convenientCard);
                    } 
                    
                    else if (parts[0].length() == 7) {
                        // Tai khoan EWallet.
                        EWallet ewallet = new EWallet(id);
                        System.out.println(ewallet.toString());
                        paymentObjects.add(ewallet);
                    }
                    
                } 
                else if (parts.length == 2) {                    
                        // Tai khoan BankAccount.
                        int accountNumber = Integer.parseInt(parts[0]);
                        double interestRate = Double.parseDouble(parts[1]);
                        BankAccount bankAccount = new BankAccount(accountNumber, interestRate);
                        System.out.println(bankAccount.toString());
                        paymentObjects.add(bankAccount);                    
                }
            }

            scanner.close(); // Dong Scanner sau khi doc xong

            return true; // Tra ve True neu doc file thanh cong
        } catch (FileNotFoundException e) {
            System.out.println("File not found."); // Bat ngoai le FileNotFoundException.
        } catch (CannotCreateCard e) {
            System.out.println("CannotCreateCard."); // Bat ngoai le CannotCreateCard.
            e.printStackTrace();
        }

        return false; // Tra ve false neu that bai
    }   
    private IDCard findIDCardById(int id, IDCardManagement idCardManagement) {
        for (IDCard idCard : idCardManagement.getIDCards()) {
            if (idCard.getIdNumber() == id) {
                return idCard;
            }
        }
        return null;
    }    

    // Requirement 4
    public ArrayList<ConvenientCard> getAdultConvenientCards() {
        ArrayList<ConvenientCard> adultConvenientCards = new ArrayList<>();

        for (Payment payment : paymentObjects) {
            if (payment instanceof ConvenientCard) {
                ConvenientCard CC = (ConvenientCard) payment;
                if (CC.getType().equals("Adult")) { // kiem tra nguoi dung ConvenientCard co phai la "Adult" ?
                    adultConvenientCards.add(CC);
                }
            }
        }

        return adultConvenientCards;
    }

    // Requirement 5

    // BankAccount.getAccountNumber() =  CC.getIdCard().getIdNumber()
    // EWallet.getPhoneNumber() = CC.getIdCard().getPhoneNumber()   

    public ArrayList<IDCard> getCustomersHaveBoth() {
        ArrayList<IDCard> customersHaveBoth = new ArrayList<>();

        for (Payment payment : paymentObjects) {
            if (payment instanceof ConvenientCard) {
                ConvenientCard CC = (ConvenientCard) payment;
                if (hasEWallet(CC) && hasBankAccount(CC)) {
                    customersHaveBoth.add(CC.getIdCard());
                }
            }
        }

        return customersHaveBoth;
    }

    private boolean hasEWallet(ConvenientCard CC) { // kiem tra co ngan hang Ewallet khong
        for (Payment payment : paymentObjects) {
            if (payment instanceof EWallet) {
                EWallet ewallet = (EWallet) payment;
                if (ewallet.getPhoneNumber() == CC.getIdCard().getPhoneNumber()) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasBankAccount(ConvenientCard CC) {  // kiem tra co ngan hang BankAccount khong
        for (Payment payment : paymentObjects) {
            if (payment instanceof BankAccount) {
                BankAccount BA = (BankAccount) payment;
                if (BA.getAccountNumber() == CC.getIdCard().getIdNumber()) {
                    return true;
                }
            }
        }
        return false;
    }

    
    // Requirement 6
    public void processTopUp(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
    
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] components = line.split(",");
                String typeCard = components[0];
                int accountId = Integer.parseInt(components[1]);
                double amount = Double.parseDouble(components[2]);
    
                // Tim ngan hang va nap tien
                for (Payment payment : paymentObjects) {
                    if (typeCard.equals("CC") && payment instanceof ConvenientCard) { // kiem tra ki tu CC va co phai doi tuong ConvenientCard
                        ConvenientCard convenientCard = (ConvenientCard) payment;
                        if (convenientCard.getIdCard().getIdNumber() == accountId) {
                            convenientCard.topUp(amount);
                            break;
                        }
                    } 
                    else if (typeCard.equals("BA") && payment instanceof BankAccount) { // kiem tra ki tu BA va co phai doi tuong BankAccount
                        BankAccount bankAccount = (BankAccount) payment;
                        if (bankAccount.getAccountNumber() == accountId) {
                            bankAccount.topUp(amount);
                            break;
                        }
                    } 
                    else if (typeCard.equals("EW") && payment instanceof EWallet) { // kiem tra ki tu EW va co phai doi tuong EWallet
                        EWallet ewallet = (EWallet) payment;
                        if (ewallet.getPhoneNumber() == accountId) {
                            ewallet.topUp(amount);
                            break;
                        }
                    }
                }
            }
    
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    // Requirement 7
    public ArrayList<Bill> getUnsuccessfulTransactions(String path) {
        ArrayList<Bill> unsuccessfulTransactions = new ArrayList<>();

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] components = line.split(",");

                int billId = Integer.parseInt(components[0].trim());
                double totalAmount = Double.parseDouble(components[1].trim());
                String purpose = components[2].trim();
                String accountType = components[3].trim();
                int accountInfo = Integer.parseInt(components[4].trim()); // so dien thoai neu EWallet

                // Xu ly thong tin hoa don
                for (Payment payment : paymentObjects) {
                    if (accountType.equals("CC") && payment instanceof ConvenientCard) { // kiem tra ki tu CC va co phai doi tuong ConvenientCard
                        ConvenientCard convenientCard = (ConvenientCard) payment;
                        if (convenientCard.getIdCard().getIdNumber() == accountInfo) {
                            boolean payFail = convenientCard.pay(totalAmount);

                            if(payFail == false){
                                Bill unsuccessfulBill = new Bill(billId, totalAmount, purpose);
                                unsuccessfulTransactions.add(unsuccessfulBill);
                            }
                            break;
                        }
                    } 
                    else if (accountType.equals("BA") && payment instanceof BankAccount) { // kiem tra ki tu BA va co phai doi tuong BankAccount
                        BankAccount bankAccount = (BankAccount) payment;
                        if (bankAccount.getAccountNumber() == accountInfo) {
                            boolean payFail = bankAccount.pay(totalAmount);

                            if(payFail == false){
                                Bill unsuccessfulBill = new Bill(billId, totalAmount, purpose);
                                unsuccessfulTransactions.add(unsuccessfulBill);
                            }
                            break;
                        }
                    } 
                    else if (accountType.equals("EW") && payment instanceof EWallet) { // kiem tra ki tu EW va co phai doi tuong EWallet
                        EWallet ewallet = (EWallet) payment;
                        if (ewallet.getPhoneNumber() == accountInfo) {
                            boolean payFail = ewallet.pay(totalAmount);

                            if(payFail == false){
                                Bill unsuccessfulBill = new Bill(billId, totalAmount, purpose);
                                unsuccessfulTransactions.add(unsuccessfulBill);
                            }
                            break;
                        }
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        return unsuccessfulTransactions;
    }       

    // Requirement 8      
    public ArrayList<BankAccount> getLargestPaymentByBA(String path) {
        ArrayList<BankAccount> largestPayments = new ArrayList<>();
        double max = 0;
    
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
    
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] components = line.split(",");
    
                // Lay thong tin giao dich              
                double totalAmount = Double.parseDouble(components[1].trim());                
                String accountType = components[3].trim();
                int accountInfo = Integer.parseInt(components[4].trim());
    
                if (accountType.equals("BA")) {
                    for (Payment payment : paymentObjects) {
                        if (payment instanceof BankAccount) {
                            BankAccount bankAccount = (BankAccount) payment;                            
                            if (bankAccount.getAccountNumber() == accountInfo) {
                                if (totalAmount > max) {
                                    max = totalAmount;
                                    largestPayments.clear();
                                }
                                if (totalAmount >= max) {
                                    largestPayments.add(bankAccount);
                                }
                                bankAccount.pay(totalAmount);
                                break;
                            }
                        }
                    }
                }
            }
    
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    
        return largestPayments;
    }
    
    

    //Requirement 9
    public void processTransactionWithDiscount(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
    
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] components = line.split(",");    

                double totalAmount = Double.parseDouble(components[1].trim());
                String purpose = components[2].trim();
                String accountType = components[3].trim();
                int accountInfo = Integer.parseInt(components[4].trim()); // So dien thoai neu EWallet
                double discount = 0; 
    
                // Xu ly thong tin hoa don
                for (Payment payment : paymentObjects) {
                    if (accountType.equals("CC") && payment instanceof ConvenientCard) {
                        ConvenientCard convenientCard = (ConvenientCard) payment;
                        if (convenientCard.getIdCard().getIdNumber() == accountInfo) {
                            boolean payFail = convenientCard.pay(totalAmount);
                            if (!payFail) {
                                // System.out.println("Bill " + billId + " paid successfully with ConvenientCard.");
                            } else {
                                // System.out.println("Payment failed for bill " + billId + " with ConvenientCard.");
                            }
                            break;
                        }
                    } else if (accountType.equals("BA") && payment instanceof BankAccount) {
                        BankAccount bankAccount = (BankAccount) payment;
                        if (bankAccount.getAccountNumber() == accountInfo) {
                            boolean payFail = bankAccount.pay(totalAmount);
                            if (!payFail) {
                                // System.out.println("Bill " + billId + " paid successfully with BankAccount.");
                            } else {
                                // System.out.println("Payment failed for bill " + billId + " with BankAccount.");
                            }
                            break;
                        }
                    } else if (accountType.equals("EW") && payment instanceof EWallet) {
                        EWallet ewallet = (EWallet) payment;
                        if (ewallet.getPhoneNumber() == accountInfo) {
                            IDCard idCard = ewallet.getIdCard();
                            if (idCard != null) {
                                // System.out.println("idCard.getAge(): " + idCard.getAge());
                                // System.out.println("idCard.getGender(): " + idCard.getGender());
                                // System.out.println("purpose: " + purpose);
                                if ((idCard.getAge() < 20 && idCard.getGender().equals("Male") && purpose.equals("Clothing") && totalAmount >= 500) ||
                                    (idCard.getAge() < 18 && idCard.getGender().equals("Female") && purpose.equals("Clothing") && totalAmount >= 500)) {
                                    // System.out.println("Discount applied to bill " + billId + " with EWallet.");
                                    discount = totalAmount * 0.15;
                                    totalAmount = totalAmount - discount;
                                } 
                            }
                            boolean payFail = ewallet.pay(totalAmount);
                            if (!payFail) {
                                // System.out.println("Bill " + billId + " paid successfully with EWallet. Remaining account balance: " + ewallet.getAccountBalance());
                            } else {
                                // System.out.println("Payment failed for bill " + billId + " with EWallet. Remaining account balance: " + ewallet.getAccountBalance());
                            }
                            break;
                        }
                    }
                }
            }
    
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
