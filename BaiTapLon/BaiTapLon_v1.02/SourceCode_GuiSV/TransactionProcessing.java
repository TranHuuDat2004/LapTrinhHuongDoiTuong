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
            System.out.println("CannotCreateCard.");
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
    // EWallet.getPhoneNumber() = ConvenientCard.getIdCard().getPhoneNumber()    

    public ArrayList<IDCard> getCustomersHaveBoth() {
        ArrayList<IDCard> customersHaveBoth = new ArrayList<>();
    
        for (Payment payment : paymentObjects) {
            if (payment instanceof ConvenientCard) {
                ConvenientCard CC = (ConvenientCard) payment;
                boolean hasBankAccount = false;
                boolean hasEWallet = false;
                for (Payment payment2 : paymentObjects) {
                    if (payment2 instanceof BankAccount) {
                        BankAccount BA = (BankAccount) payment2;
                        if (BA.getAccountNumber() == CC.getIdCard().getIdNumber()) {
                            System.out.println("BA.getAccountNumber():" + BA.getAccountNumber());
                            System.out.println("CC.getIdCard().getIdNumber():" + CC.getIdCard().getIdNumber());
                            hasBankAccount = true;
                            break;
                        }
                    } 
                    if (payment2 instanceof EWallet) {
                        EWallet ewallet = (EWallet) payment2;
                        if (ewallet.getPhoneNumber() == CC.getIdCard().getIdNumber()) {
                            System.out.println("ewallet.getPhoneNumber():" + ewallet.getPhoneNumber());
                            System.out.println("CC.getIdCard().getPhoneNumber():" + CC.getIdCard().getPhoneNumber());
                            hasEWallet = true;
                            break;
                        }
                    }
                    if (hasBankAccount && hasEWallet) {
                        customersHaveBoth.add(CC.getIdCard());
                    }   
                }
                        
            } else if (payment instanceof EWallet) {
                EWallet ewallet = (EWallet) payment;
                boolean hasBankAccount = false;
                boolean hasConvenientCard = false;
                for (Payment payment2 : paymentObjects) {
                    if (payment2 instanceof BankAccount) {
                        BankAccount BA = (BankAccount) payment2;
                        if (BA.getAccountNumber() == ewallet.getPhoneNumber()) {
                            hasBankAccount = true;
                            break;
                        }
                    } 
                    if (payment2 instanceof ConvenientCard) {
                        ConvenientCard CC = (ConvenientCard) payment2;
                        if (CC.getIdCard().getIdNumber() == ewallet.getPhoneNumber()) {
                            hasConvenientCard = true;
                            break;
                        }
                    }
                }
                if (hasBankAccount && hasConvenientCard) {
                    customersHaveBoth.add(ewallet.getIdCard());
                }
            } else if (payment instanceof BankAccount) {
                BankAccount BA = (BankAccount) payment;
                boolean hasConvenientCard = false;
                boolean hasEWallet = false;
                for (Payment payment2 : paymentObjects) {
                    if (payment2 instanceof ConvenientCard) {
                        ConvenientCard CC = (ConvenientCard) payment2;
                        if (CC.getIdCard().getIdNumber() == BA.getAccountNumber()) {
                            hasConvenientCard = true;
                            break;
                        }
                    } 
                    if (payment2 instanceof EWallet) {
                        EWallet ewallet = (EWallet) payment2;
                        if (ewallet.getPhoneNumber() == BA.getAccountNumber()) {
                            hasEWallet = true;
                            break;
                        }
                    }
                }
                if (hasConvenientCard && hasEWallet) {
                    customersHaveBoth.add(BA.getIdCard());
                }
            }
        }
    
        return customersHaveBoth;
    }
    
    // Requirement 6
    public void processTopUp(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // lay tung dong
                String[] components = line.split(","); //lay tung du lieu
                String typeCard = components[0];
                int accountId = Integer.parseInt(components[1]);
                double amount = Double.parseDouble(components[2]);

                // Tim ConvenientCard co accountId trong danh sach paymentObjects va nap tien
                for (Payment payment : paymentObjects) {
                    if (typeCard.equals("CC")) {
                        ConvenientCard convenientCard = (ConvenientCard) payment;  // ep kieu bien payment
                        if (convenientCard.getIdCard().getIdNumber() == accountId) {
                            convenientCard.topUp(amount);
                            break;
                        }
                    }
                    else if (typeCard.equals("BA")) {
                        BankAccount bankAccount = (BankAccount) payment;  // ep kieu bien payment
                        if (bankAccount.getIdCard().getIdNumber() == accountId) {
                            bankAccount.topUp(amount);
                            break;
                        }
                    }
                    else if (typeCard.equals("EW")) {
                        EWallet ewallet = (EWallet) payment; // ep kieu bien payment
                        if (ewallet.getIdCard().getIdNumber() == accountId) {
                            ewallet.topUp(amount);
                            break;
                        }
                    }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found."); // Bat ngoai le FileNotFoundException.
        }
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
