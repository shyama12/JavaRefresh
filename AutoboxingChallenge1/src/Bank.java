import java.util.ArrayList;
import com.company.validations.BranchValidation;

public class Bank {

    private String bankId;
    private ArrayList<Branch> branchesList;

    public Bank(String bankId) {
        this.bankId = bankId;
        branchesList = new ArrayList<Branch>();
    }

    public String getBankId() {
        return bankId;

    }

    public int branchExists( String branchId ){
        if (branchesList.size()!=0 && branchesList!=null) {
            for (int i = 0; i < branchesList.size(); i++) {

                if (branchesList.get(i).getBranchId().equals(branchId.toUpperCase())){
                    return i;
                }

            }

        }
        return -1;
    }


    public boolean addBranch(Branch branch ) {
        if (branchExists(branch.getBranchId())<0){
            if (BranchValidation.isValidBranch(branch.getBranchId())) {
                branchesList.add(branch);
                return true;
            }else{
                System.out.println("Invalid Branch Id");
            }
        }else{
            System.out.println("This branch already exists");
        }
        return false;
    }


    public void displayCustomersAndTransactionsForABranch (String branchId){
        if (branchExists(branchId)>=0){
            this.branchesList.get(branchExists(branchId)).printCustomersAndTransactions();

        }else{
            System.out.println("This branch does not exist");
        }
    }


    public void addCustomerToBranch ( String branchId, Customer customer, double initialTxnAmt){
        if (branchExists(branchId)>=0){
            this.branchesList.get(branchExists(branchId)).addCustomer(customer, initialTxnAmt);

        }else{
            System.out.println("This branch does not exist");
        }
    }

    public void addTransaction( String branchId, String customerId, double txnAmt){
        if (branchExists(branchId)>=0){
            this.branchesList.get(branchExists(branchId)).addTransaction(customerId, txnAmt);

        }else{
            System.out.println("This branch does not exist");
        }
    }

}
