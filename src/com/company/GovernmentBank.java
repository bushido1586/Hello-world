package com.company;

public class GovernmentBank implements BankRules {

    String customerName;

    GovernmentBank(String customerName){
        this.customerName=customerName;
    }
    @Override
    public void interestPaid() {
        System.out.println(this.customerName+" is paid an interest rate of 7%");
    }
}
