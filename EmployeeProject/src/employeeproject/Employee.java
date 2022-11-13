/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;

/**
 *
 * @author MSI
 */
public class Employee {
    String name;
    int SSN;
    double wage;
    int workHoures;
   // public static String companyName="Apple";
    CompanyName companyName;
    int number;
    static int _number;
    
    
    
    public Employee(String name,int SSI,double wage, int workHoures){
        this.name=name;
        this.SSN=SSI;
        this.wage=wage;
        this.workHoures=workHoures;
        number ++;
        _number++;
    }
    void display(){
        System.out.println("name: "+name+" SSI : "+SSN+" Company Name: "+companyName.google);
    }
    void displaySalary(){
        System.out.println("salary : "+workHoures*wage);
    }
}
