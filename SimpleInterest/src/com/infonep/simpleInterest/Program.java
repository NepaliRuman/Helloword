/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infonep.simpleInterest;

/**
 *
 * @author dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator si = new Calculator();
        si.setPrinciple(4000);
        si.setTime(3);
        si.setRate(5);
        
        
        si.calculate();
    }
    
}
