/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encaptulationstudentproject;

/**
 *
 * @author MSI
 */
public class EncaptulationStudentProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      EncapsulatedStudent s=new EncapsulatedStudent(100, 80);
      s.setMidterm(100);
        System.out.println(s.getMidterm());
      
    }
    
}
