package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentRecordTest {
    StudentRecord studentrecord;

    @After
    public void startInitial() throws Exception {
        studentrecord=null;
    }

    @Test
    public void testValue()
    {
        studentrecord=new StudentRecord(3);
        studentrecord.getValue(40,50,60);
        assertEquals(50,studentrecord.getAvg());
        assertEquals(40,studentrecord.getMin());
        assertEquals(60,studentrecord.getMax());
    }

    @Test
    public void testValue1()
    {
        studentrecord=new StudentRecord(7);
        studentrecord.getValue(11,22,33,44,55,66,77);
        assertEquals(44,studentrecord.getAvg());
        assertEquals(11,studentrecord.getMin());
        assertEquals(77,studentrecord.getMax());
    }

}