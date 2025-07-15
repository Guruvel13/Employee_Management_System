package com.example.Employee.Controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {
    @Test
    public void testSampleTest(){
        Sample s = new Sample();
        String str = s.SamTest();
        System.out.println(str);
        assertEquals("Sample Test",str);
    }
}
