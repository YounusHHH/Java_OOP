/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentProject;

/**
 *
 * @author MSI
 */
public class Student {
   String name ;
   double midterm;
   double finalsco;
   
   public Student(String name,double midterm,double finalsco){
       this.name=name;
       this.midterm=midterm;
       this.finalsco=finalsco;
       
       
       
   }
   double CalculateScore(double midterm ,double finalsco){
       return 0.40 * midterm + 0.60* finalsco;
   }
void info(){
    System.out.println("Name: "+name+" midterm: "+midterm+" final: "+finalsco);
}

}