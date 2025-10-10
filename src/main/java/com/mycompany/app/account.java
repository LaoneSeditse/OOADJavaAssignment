package com.mycomputer.app
// Abstract Account 

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String branch;
    protected Customer customer;
    
    public Account(String accountNumber, double balance, String branch, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;
        this.customer = customer;
    }
    
    // Abstract methods
    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract void calculateInterest();
    
    // Getters and setters
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public Customer getCustomer() { return customer; }
}

// Savings Account
public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.0005; // 0.05% monthly
    
    public SavingsAccount(String accountNumber, double balance, String branch, Customer customer) {
        super(accountNumber, balance, branch, customer);
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    @Override
    public boolean withdraw(double amount) {
        // Savings account doesn't allow withdrawals
        return false;
    }
    
    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
    }
}

// Investment Account
public class InvestmentAccount extends Account {
    private static final double INTEREST_RATE = 0.05; // 5% monthly
    private static final double MIN_INITIAL_DEPOSIT = 500.00;
    
    public InvestmentAccount(String accountNumber, double balance, String branch, Customer customer) {
        super(accountNumber, balance, branch, customer);
        if (balance < MIN_INITIAL_DEPOSIT) {
            throw new IllegalArgumentException("Minimum initial deposit for Investment account is BWP500.00");
        }
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
    }
}

// Cheque Account
public class ChequeAccount extends Account {
    private String employer;
    private String companyAddress;
    
    public ChequeAccount(String accountNumber, double balance, String branch, 
                        Customer customer, String employer, String companyAddress) {
        super(accountNumber, balance, branch, customer);
        this.employer = employer;
        this.companyAddress = companyAddress;
    }
    
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    @Override
    public void calculateInterest() {
        // Cheque accounts typically don't pay interest
    }
    
    // Getters
    public String getEmployer() { return employer; }
    public String getCompanyAddress() { return companyAddress; }
}

// Customer class
public class Customer {
    private String customerId;
    private String firstname;
    private String surname;
    private String address;
    private List<Account> accounts;
    
    public Customer(String customerId, String firstname, String surname, String address) {
        this.customerId = customerId;
        this.firstname = firstname;
        this.surname = surname;
        this.address = address;
        this.accounts = new ArrayList<>();
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }
    
    // Getters
    public String getCustomerId() { return customerId; }
    public String getFirstname() { return firstname; }
    public String getSurname() { return surname; }
    public String getAddress() { return address; }
}

// Bank class to manage the system
public class Bank {
    private List<Customer> customers;
    private Map<String, Account> accounts;
    
    public Bank() {
        this.customers = new ArrayList<>();
        this.accounts = new HashMap<>();
    }
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
        account.getCustomer().addAccount(account);
    }
    
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    
    public Customer findCustomerById(String customerId) {
        return customers.stream()
                .filter(c -> c.getCustomerId().equals(customerId))
                .findFirst()
                .orElse(null);
    }
}
