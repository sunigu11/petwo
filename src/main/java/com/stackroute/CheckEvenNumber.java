package com.stackroute;

public class CheckEvenNumber {

    public static boolean isEven(int num)
    {
        if(num%2==0)
            return true;
        else
            return false;
    }

    public static boolean isChar(char ch)
    {
        if( (ch>=65 && ch<=90) || (ch>=90 && ch<=122))
            return true;
        else
            return false;
    }
}
