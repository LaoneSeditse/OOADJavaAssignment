package com.example.java_assignment;

public interface Interest {
    default void chargeInterest( float interestRate, double interestAmount) {}
}
