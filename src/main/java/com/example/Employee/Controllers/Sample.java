package com.example.Employee.Controllers;

public class Sample {
    public String SamTest(){
        if(assertEquals(5,5)) {
            return "Sample Test";
        }
        return "Sample";
    }

    private boolean assertEquals(int i, int i1) {
        return i == i1;
    }
}
