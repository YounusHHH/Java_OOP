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
public class StaticProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1=new Student(1,"ali");
        Student s2=new Student(2,"yoyo");
        
        s1.getInfo();
        s1.collageNmae="iu";
        s2.getInfo();
        s1.getInfo();
        
    }
    
}
