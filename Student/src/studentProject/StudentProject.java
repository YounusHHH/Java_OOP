/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentProject;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class StudentProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double mid , fin;
        
        System.out.println("Enter midterm score:");
        mid=input.nextInt();
        System.out.println("Enter midterm final:");
        fin=input.nextInt();
        Student s=new Student("younus",mid,fin);
        s.info();
        System.out.println(s.CalculateScore(mid, fin));
        
    }
    
}
