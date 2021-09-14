package com.company;

public class Main {

    public static void main(String[] args) {
	//^The      String starts with The
        //end$      String ends with end
        //roar      String contains roar
        //abc*      String has ab and 0 to any number of c (*c)
        //abc+      String has ab and 1 to any number of c (+c)
        //abc?      String has ab and 0 or 1 c (?c)
        //abc{2}    String has ab and exactly 2 cs
        //abc{2,}   String has ab and 2 or more c
        //abc{2, 5} String has ab and 2 to 5 c


        //a(bc)*    String has a and 0 or anyn number of bc
        //a(bc){2, 5}   String has a and 2 to 5 bc
        //a(b|c) ans a[bc] are same

        // \d       matches a single digit (0 to 9)
        // \D       matches a single non digit character
        // \w       matches a single alphanumeric character or _
        // \s       matches a space character
        // .        matches any character


        //CHARACTER THAT NEED ESCAPE
        // ^ . [ $ (  )  |  *  +  ?  {  \
    }
}
