package com.example.java_assignment;

public class Savings extends Account implements Interest{

    private double Interestrate = 2.66;

    public Savings(int AccountNumber, String CustomerName, double balance, double Interestrate) {
        super(AccountNumber, CustomerName, balance);
        this.Interestrate = Interestrate;
    }

    @Override
    public void chargeInterest( float interestRate, double interestAmount) {
        this.Interestrate+=interestRate;

        if (interestAmount > 0.0 && interestRate > 0.0) {
            double interest = interestAmount * this.Interestrate;

            this.setBalance(getBalance() - interest);
            //System.out.println ("Interest Charged");
        }
    }
}
