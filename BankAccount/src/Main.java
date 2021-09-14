public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(22433,100.00, "Shyama Menon", "shyama12@hotmail.com", "+47 99877039");
        /*ba.setAccountNumber(243);
        ba.setBalance(100.00);
        ba.setCustomerName("Shyama Menon");
        ba.setEmail("shyama12@hotmail.com");
        ba.setPhoneNumber("+47 99877039");*/

        ba.depositFunds(12.00);
        ba.withdrawFunds(113.00);

        BankAccount defaultBA = new BankAccount();
        defaultBA.withdrawFunds(1.00);
    }
}
