public class EWallet implements Payment, Transfer {
	private int phoneNumber;
    private double accountBalance;

    public EWallet(int phoneNumber) {
        setPhoneNumber(phoneNumber);
        this.accountBalance = 0.0;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    //interface Payment
    public boolean pay(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Payment successful. Remaining account balance: " + accountBalance);
            return true;
        } else {
            System.out.println("Insufficient funds. Payment failed.");
            return false;
        }
    }

    //interface Payment, Transfer
    public double checkBalance() {
        return getAccountBalance();
    }

    //interface Transfer
    public boolean transfer(double amount, Transfer to) {
        double transferAmount = amount + amount * Transfer.transferFee;
        if (transferAmount <= this.accountBalance) {
            this.accountBalance -= transferAmount;
            if (to instanceof EWallet) { // kiem tra co phai la ngan hang EWallet
                ((EWallet) to).receive(amount);
            } else if (to instanceof BankAccount) { // kiem tra co phai la ngan hang BankAccount
                ((BankAccount) to).receive(amount);
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

    public void topUp(double amount) {
        accountBalance += amount;
        System.out.println("Top Up successful. New account balance: " + accountBalance);
    }

    public String toString() {
        return getPhoneNumber() + "," + getAccountBalance();
    }

    public IDCard getIdCard() {
        return null;
    }

}
