public class Main {

    public static void main(String[] args) {
	 Bank account = new Bank();
     account.setAccountNumber(12345);
     account.setAccountBalance(200.50);
     account.setCustomerName("sambeet");
     account.setEmail("khatuasambeet31@gmail.com");
     account.setPhNumber(7377051689L);
        System.out.println("your account number is "+account.getAccountNumber());
        System.out.println("your name is "+account.getCustomerName());
        System.out.println("your email is "+account.getEmail());
        System.out.println("your contact number is "+account.getPhNumber());
        account.withdraw(300);
        account.deposit(200.50);
        account.withdraw(100.25);
    }
}
