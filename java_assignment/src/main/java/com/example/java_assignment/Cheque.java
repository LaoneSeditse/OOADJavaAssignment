package com.example.java_assignment;

public class Cheque extends  Account implements Withdrawal {

    public Cheque(int AccountNumber, String CustomerName, double balance) {
        super(AccountNumber, CustomerName, balance);
    }

    @Override
    public void withdrawal(double amount) {
        this.setBalance(getBalance() - amount);
    }

}
