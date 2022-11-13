/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printpro;

/**
 *
 * @author msi 1
 */
public class CanonPro extends Printer implements ColoredPrint,Fax,Scan{

    @Override
    public void coloredPrint() {
        
    }

    @Override
    public void fax() {
        System.out.println("Canon Pro");
    }

    @Override
    public void scan() {
        
    }
    
}
