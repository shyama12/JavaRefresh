package com.company.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerValidation {

    public static boolean isValidCustomer(String customerId){
        Pattern pattern = Pattern.compile("CUS[0-9][0-9][0-9][0-9][0-9]");
        Matcher matcher = pattern.matcher(customerId);
        return matcher.find();
    }

}
