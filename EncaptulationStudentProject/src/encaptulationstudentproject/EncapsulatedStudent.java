/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encaptulationstudentproject;

import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author MSI
 */
public class EncapsulatedStudent {
    private int midterm;
    private int finalexam;

    public EncapsulatedStudent(int midterm, int finalexam) {
        this.midterm = midterm;
        this.finalexam = finalexam;
    }

    public int getMidterm() {
        return midterm;
    }

    public void setMidterm(int midterm) {
        if(midterm<0 || midterm>100)
            throw new IllegalArgumentException("the value less then 0 or biger then 100");
        this.midterm=midterm;
    }

    public int getFinalexam() {
        return finalexam;
    }

    public void setFinalexam(int finalexam) {
        if(finalexam<0 || finalexam>100)
            throw new IllegalArgumentException("the value less then 0 or biger then 100");
        this.finalexam=finalexam;
    }
    public double getAv(){
        return this.midterm*0.40+this.finalexam*0.60;
    }
    
    

    

}
