package com.max;

public class FinanceReport implements Report{


    @Override
    public void load() {
        System.out.println("Finanace loading data");
    }

    @Override
    public void print() {
        System.out.println("Finance printing data");
    }
}
