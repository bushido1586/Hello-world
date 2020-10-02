package com.company;

public class PrivateBank implements BankRules{
    String customerName;

    PrivateBank(String customerName){
        this.customerName=customerName;
    }

    @Override
    public void interestPaid() {
        System.out.println(this.customerName+" is paid interest of 5%");
    }
}
