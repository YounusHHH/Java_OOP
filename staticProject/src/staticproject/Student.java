/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticproject;

/**
 *
 * @author msi 1
 */
public class Student {
    int stuNumber;
    String name;
    static String collageNmae;
    

public Student(int stuNumber,String name  ){
this.stuNumber=stuNumber;
this.name=name;
this.collageNmae="karabuk uni";
}

public void getInfo(){
System.out.println(this.name+" "+ this.stuNumber+" "+collageNmae );
}
}
