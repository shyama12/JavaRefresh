public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("ABCD bank");
        Branch branchABCD1 = new Branch("BII001");
        bank.addBranch(branchABCD1);
        Branch branchABCD2 = new Branch("BII002");
        bank.addBranch(branchABCD2);

        System.out.println("Failure conditions");
        //invalid branch id
        Branch branchABCD3 = new Branch("Bpppp");
        bank.addBranch(branchABCD3);

        //branch already exists
        Branch branchABCD4 = new Branch("BII002");
        bank.addBranch(branchABCD4);

        bank.displayCustomersAndTransactionsForABranch("Bpppp");

        Customer BII001customer1 = new Customer("CUS00001", "Shyama");
        Customer BII001customer2 = new Customer("CUS00002", "Hari");
        Customer BII001customer3 = new Customer("CUSxxx", "Invalid");

        //branch does not exist
        bank.addCustomerToBranch("Bppp", BII001customer1, 0.00);

        bank.addCustomerToBranch("BII001", BII001customer1, 0.00);
        bank.addCustomerToBranch("BII001", BII001customer2, 0.00);

        //customer already exists
        bank.addCustomerToBranch("BII001", BII001customer2, 0.00);

        //invalid customer id
        bank.addCustomerToBranch("BII001", BII001customer3, 0.00);

        bank.addTransaction("BII001", "CUS00001", 20.00);
        bank.addTransaction("BII001", "CUS00001", -30.00);

        //no such customer
        bank.addTransaction("BII001", "CUS12345", -30.00);
        bank.addTransaction("BII001", "CUSccc", -30.00);

        //
        bank.displayCustomersAndTransactionsForABranch("BII001");
        bank.displayCustomersAndTransactionsForABranch("BII002");

    }
}
