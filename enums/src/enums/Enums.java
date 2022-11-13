/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Enums {

    enum cars{
        opel,bmw,skoda,audi;
    }
    
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("please enter an operator");
//        char x;
//        int s=5;
//        int q=3;
//        x=input.next().toLowerCase().charAt(0);
//        int result;
//        switch (x){
//            case '+':
//                result=s+q;
//                System.out.println("result of sum is : " +result );
//                break;
//                
//        }
    cars [] car=cars.values();
    for(cars l :car){
        System.out.println(l);
    }
        
    }
    
}
