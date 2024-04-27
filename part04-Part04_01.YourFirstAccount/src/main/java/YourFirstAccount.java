
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account arnaudAccount = new Account("Arnaud's account", 100.00);
        
        System.out.println("Initial state");
        System.out.println(arnaudAccount);
        arnaudAccount.deposit(20);
        System.out.println(arnaudAccount);
    }
}
