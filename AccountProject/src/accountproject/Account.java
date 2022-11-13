/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountproject;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Account {
    private double balance;
    private String ownerName;
    
    
    public Account(String name,Double balance){
        this.balance=balance;
        this.ownerName=name;
        
    }
    public void add(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        int pass=1234;
        int inputpass;
        System.out.println("Please Enter Password");
        Scanner input=new Scanner(System.in);
        inputpass=input.nextInt();
        if (pass==inputpass)
        balance-=amount;
        else{
            System.out.println("Wrong password");
        }
    }
    public double getBalance(){
        return balance;
        
    }
    public void setOwnerName(String name){
        this.ownerName=name;
    }
    
    public String getOwnerName(){
        return ownerName;
    }
    
}
