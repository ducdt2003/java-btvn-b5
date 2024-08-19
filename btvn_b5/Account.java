package btvn_b5;

import java.util.Scanner;

class Account {
    private String username;
    private String password;
    private double balance;

    public Account() {
    }

    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void showAccount() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ");
        } else {
            balance -= amount;
            System.out.println(" Số dư còn lại là " + balance);
        }
    }

}


