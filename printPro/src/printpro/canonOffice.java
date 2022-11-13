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
public class canonOffice extends Printer implements Scan,Fax{

    @Override
    public void scan() {
    }

    @Override
    public void fax() {
        System.out.println("Canon Office");
    }
    
}
