import com.company.validations.BranchValidation;
import com.company.validations.CustomerValidation;

import java.util.ArrayList;

public class Branch {

    private String branchId;
    private ArrayList<Customer> customersList;

    public Branch(String branchId) {
        if (BranchValidation.isValidBranch(branchId)){
            this.branchId = branchId;
            this.customersList = new ArrayList<Customer>();
        }else{
            System.out.println("Invalid Branch Id. Branch Id should be in the format B**XXX, where * is a capital letter and X is a digit");
        }
    }

    public String getBranchId() {
        return branchId;
    }


    public int customerExists( String customersId ){
        if (customersList.size()!=0 && customersList!=null) {
            for (int i = 0; i < customersList.size(); i++) {

                if (customersList.get(i).getCustomerId().equals(customersId.toUpperCase())){
                    return i;
                }

            }

        }
        return -1;
    }


    public boolean addCustomer(Customer customer, double initialTxnAmount ) {
        if (customerExists(customer.getCustomerId())<0){
            if (CustomerValidation.isValidCustomer(customer.getCustomerId())) {
                customer.addTransaction(initialTxnAmount);
                customersList.add(customer);
                return true;
            }else{
                System.out.println("Invalid Customer Id");
            }
        }else{
            System.out.println("This customer already exists");
        }
        return false;
    }

    public boolean addTransaction(String customerId, double transactionAmount) {
        if (customerExists(customerId)>=0){
            customersList.get(customerExists(customerId)).addTransaction(transactionAmount);
            return true;
        }else{
            System.out.println("This customer does not exist");
            return false;
        }

    }

    public void printCustomersAndTransactions () {
        if (customersList.size()==0||customersList==null){
            System.out.println("Branch Id "+this.branchId+" does not have any customers");
        }else {
            System.out.println("Branch Id : " + branchId);
            System.out.println("***************************************************************************************************************");
            for (int i = 0; i < customersList.size(); i++) {
                customersList.get(i).printCustomerTransactions();
                System.out.println("***************************************************************************************************************");
            }
        }
    }
}
