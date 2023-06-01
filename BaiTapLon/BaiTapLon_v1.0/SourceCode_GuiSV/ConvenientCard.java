public class ConvenientCard implements Payment{
	private String type;
    private IDCard idCard;
    private double accountBalance;

    public ConvenientCard(IDCard idCard) throws CannotCreateCard {
        this.idCard = idCard;
        int age = calculateAge(idCard.getDateOfBirth());
        if (age < 12) {
            throw new CannotCreateCard("Not enough age");
        } else if (age <= 18) {
            this.type = "Student";
        } else {
            this.type = "Adult";
        }
        this.accountBalance = 100.0;
    }

    public String getType() {
        return type;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

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

    public double checkBalance() {
        return accountBalance;
    }

    public void topUp(double amount) {
        accountBalance += amount;
        System.out.println("Top-up successful. New account balance: " + accountBalance);
    }

    public String toString() {
        return idCard.toString() + "," + getType() + "," + getAccountBalance();
    }

	public int calculateAge(String dateOfBirth){
        String[] lines = dateOfBirth.split("\n"); // Tach du lieu thanh tung dong
        int age = 0;
        for (String dong : lines) {
            String[] dataYear = dong.split("/"); // lay du lieu tung dong
            String yearString = dataYear[2]; // Lay nam sinh kieu du lieu la String
            int year = Integer.parseInt(yearString); // bien String thanh integer
            age = 2023 - year;       

            // System.out.println("Age: " + age);
        }

        return age;
    }

    public IDCard getIdCard() {
        return null;
    }

    public int getInterestRate() {
        return 0;
    }

}
