package com.stackroute;

public class Palindrome {
    public static boolean checkPal(String actual)
    {
        String reverse=new StringBuffer(actual).reverse().toString();
        if(actual.equals(reverse))
            return true;
        else
            return false;

    }
}
