package com.stackroute;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentRecordTest {
    StudentRecord studentrecord=new StudentRecord();

    @Before
    public void setup()
    {
        int arr[]={40,50,60};
    }

    @Test
        public void studentInput()
        {
            assertEquals(50,studentrecord.getAvg(arr));
        }

    @Test
        public void studentValue()
        {
            assertEquals(40,studentrecord.getMin(arr));
        }

    @Test
        public void studentValue()
        {
            assertEquals(60,studentrecord.getMax(arr));
        }

}