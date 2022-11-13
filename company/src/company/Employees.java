/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

/**
 *
 * @author msi 1
 */
public class Employees {
    int id;
    String name;
    double salary;
    static String companyName;
    
    public Employees(int id ,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.companyName="APPLE";
        
    }
    public void getInfo(){
        System.out.println(this.name+" "+ this.id+" "+this.salary+" "+companyName );
    }

}