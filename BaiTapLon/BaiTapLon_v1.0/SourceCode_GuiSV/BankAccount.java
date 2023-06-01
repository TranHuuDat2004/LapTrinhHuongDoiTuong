public class BankAccount implements Payment, Transfer{
    private int accountNumber;
    private double interestRate;
    private double accountBalance;

    public BankAccount(int accountNumber, double interestRate) {
        setAccountNumber(accountNumber);
        setInterestRate(interestRate);        
        this.accountBalance = 50.0;
    }

    public BankAccount() {
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    
    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getInterestRate(){
        return this.interestRate;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    //interface Payment
    public boolean pay(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;            
            System.out.println("Payment successful. Remaining account balance: " + accountBalance);
            return true;
        } else {
            System.out.println("Insufficient funds for payment. Payment failed.");
            return false;
        }
    }

    //interface Payment, Transfer
    public double checkBalance() {
        return accountBalance;
    }

    //interface Transfer
    public boolean transfer(double amount, Transfer to) {
        double transferAmount = amount + amount * Transfer.transferFee;
        if (transferAmount <= this.accountBalance + 50) { // so du toi thieu 50
            this.accountBalance -= transferAmount;
            if (to instanceof BankAccount) { // kiem tra co phai la ngan hang BankAccount
                ((BankAccount) to).receive(amount);
            } else if (to instanceof EWallet) { // kiem tra co phai la ngan hang EWallet
                ((EWallet) to).receive(amount);
            }
            System.out.println("Transfer successful: " + transferAmount +  ", Remaining account balance: " + accountBalance);
            return true;
        } else {
            System.out.println("Insufficient funds for transfer. Transfer failed.");
            return false;
        }
    }

    public void receive(double amount) {
        accountBalance += amount;
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposit successful. Updated account balance: " + accountBalance);
    }

    public String toString() {
        return accountNumber + "," + interestRate + "," + accountBalance;
    }

    public IDCard getIdCard() {
        return null;
    }

    public void setAccountNumber(String accountNumber2) {
    }
}
