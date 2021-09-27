package com.company.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BranchValidation {

    public static boolean isValidBranch(String branchId){
        Pattern pattern = Pattern.compile("B[A-Z][A-Z][0-9][0-9][0-9]");
        Matcher matcher = pattern.matcher(branchId);
        return matcher.find();
    }
}
