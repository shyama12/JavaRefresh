import com.company.validations.CustomerValidation;

import java.util.ArrayList;

public class Customer {

    private String customerId;
    private String customerName;
    private ArrayList<Double> transactionsList;

    public Customer(String customerId, String customerName) {
        if (CustomerValidation.isValidCustomer(customerId)){
            this.customerId = customerId;
            this.customerName = customerName;
            transactionsList = new ArrayList<Double>();
        }else{
            System.out.println("Invalid Customer Id. Customer Id should be in the format CUSXXXXX, where X is a digit");
        }
    }

    public String getCustomerId() {
        return customerId;
    }

    public void addTransaction( double transactionAmount) {
        transactionsList.add(Double.valueOf(transactionAmount));
    }

    /*public String getCustomerName() {
        return customerName;
    }*/

    public void printCustomerTransactions(){
        System.out.println("\t\tCustomer Id : "+this.customerId);
        System.out.println("\t\tCustomer Name : "+this.customerName);
        System.out.println("\t\tTransactions :");
        for (int i = 0; i < transactionsList.size(); i++) {
            System.out.println("\t\t"+transactionsList.get(i));
        }
    }
}
