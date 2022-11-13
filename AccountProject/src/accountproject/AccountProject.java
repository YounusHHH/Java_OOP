/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountproject;

/**
 *
 * @author MSI
 */
public class AccountProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a=new Account("Ali", 99.5);
        System.out.println(a.getOwnerName());
        System.out.println(a.getBalance());
        a.setOwnerName("younus");
        a.add(100);
        System.out.println(a.getOwnerName());
        System.out.println(a.getBalance());
        a.withdraw(50);
        System.out.println(a.getBalance());
        
    }
    
}
