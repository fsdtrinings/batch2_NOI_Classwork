package com.self.rex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

    public static void main(String[] args) {

        String myRegExp = "[A-Z]{4}\\d{2,3}[ERT]{2}-[^ABC]{2}"; // Takes regular expression
        String input1 = "abcd23ER-WE";  // Some sample inputs
        String input2 = "abcd23ER-AB";
        String input3 = "abcd23ER-ASP";
        String input4 = "abcd233TE-MR";
        String input5 = "abcd233TE-CT";


        String output =  doMatch(myRegExp,input1)? "valid" : "invalid";
        System.out.println(output+" "+input1);

        output =  doMatch(myRegExp,input2)? "valid" : "invalid";
        System.out.println(output+" "+input2);

        output =  doMatch(myRegExp,input3)? "valid" : "invalid";
        System.out.println(output+" "+input3);

        output =  doMatch(myRegExp,input4)? "valid" : "invalid";
        System.out.println(output+" "+input4);
  }
    public static boolean doMatch(String regex, String input) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // Pattern class check the regular expression first
        Matcher matcher = pattern.matcher(input); // class checks the String based on regular expression
        boolean b = matcher.find();
        return b;
    }
}
