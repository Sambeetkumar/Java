public class Bank {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhNumber() {
        return phNumber;
    }
    public void deposit(double depositAmount){
        this.accountBalance+=depositAmount;
        System.out.println("Deposit of "+depositAmount+" $ made, new balance is "+accountBalance+" $.");
    }
    public void withdraw(double withdrawAmount){
        if(accountBalance-withdrawAmount<0){
            System.out.println("Insufficient balance, you have only "+accountBalance+" $ in your account.");
        }
        else {
            accountBalance-=withdrawAmount;
            System.out.println("withdraw of "+withdrawAmount+" $ is made, remaining balance : "+accountBalance+" $.");
        }
    }
}
