/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author chiew256
 */
public class Q2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Chiew Kian Khoon", "010510040295", 100000);
        account1.displayBalance();
        account1.deposit(500);
        account1.displayBalance();
        account1.withdraw(599);
        account1.displayBalance();
    }
}

class BankAccount{
    private String name;
    private String IC;
    private int balance;

    public BankAccount(String name, String IC, int balance){
        this.name = name;
        this.IC = IC;
        this.balance = balance;
    }

    public void deposit(int a){
        System.out.println("Deposit " +  a);
        balance += a;
    }

    public void withdraw(int a){
        System.out.println("Withdraw " +  a);
        balance -= a;
    }

    public void displayBalance(){
        System.out.println("The balance of the account is " + balance);
    }
}
