package com.demo.demo.oop.encapsulation;

public class BankAccount {
    private String owner;
    private double balance;
    private String accountNumber;

    public BankAccount(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    //Сеттер с валидацией
    public void setOwner(String owner) {
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Имя владельца не может быть пустым");
        }
        this.owner = owner;
    }

    //Методы для операций
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной");

        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        balance -= amount;
    }
}