public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    BankAccount() {
        this(0000, 0.00, "Test Value", "Test Value", "Test Value");
        System.out.println("Initial Constructor Call");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this(0000, 0.00, customerName, email, phoneNumber);
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void depositFunds ( double depositAmount ) {
        this.balance += depositAmount;
        System.out.println( "Deposit successful. Current balance is "+this.balance);
    }

    public void withdrawFunds ( double withdrawalAmount ) {
        if (this.balance-withdrawalAmount<0) {
            System.out.println( "Unable to withdraw amount. Account balance too low. Current balance is "+this.balance);
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Current balance is " + this.balance);
        }
    }

}
