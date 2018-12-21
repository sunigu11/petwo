package com.stackroute;

public class Original
{
    private int originalNumber;

    public Original()
    {
        //originalNumber = (int)(Math.random()*50);//For Range 1 - 50

        //originalNumber = (int)(Math.random()*100);//For Range 1 - 100

        originalNumber = 31;
    }

    public String numberChecker(int input)
    {
        if(originalNumber==input)
        {
            return "number guessed matches the original number";
        }
        else if(originalNumber>input)
        {
            return "number guessed less the original number";
        }
        else
        {
            return "number guessed greater the original number";
        }
    }
}
