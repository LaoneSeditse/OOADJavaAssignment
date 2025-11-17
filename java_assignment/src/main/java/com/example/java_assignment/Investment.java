package com.example.java_assignment;

public class Investment extends Account implements Withdrawal,Interest {
    private double InterestRate = 2.34;

    public Investment(int AccountNumber, String CustomerName, double balance, double Interestrate) {
        super(AccountNumber, CustomerName, balance);
        this.InterestRate = Interestrate;
    }

    @Override
    public void chargeInterest( float interestRate, double interestAmount) {
        this.InterestRate+=interestRate;

        if (interestAmount > 0.0 && interestRate > 0.0) {
            double interest = interestAmount * this.InterestRate;

            this.setBalance(getBalance() - interest);
            //System.out.println ("Interest Charged");
        }

    }
    @Override
    public void withdrawal(double amount) {
        this.setBalance(getBalance() - amount);
    }
}