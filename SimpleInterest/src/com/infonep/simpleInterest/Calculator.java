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
public class Calculator {
    private double principle;
    private int time;
    private double rate;
    
    
    public void setPrinciple(double principle){
        this.principle=principle;
    }
    
        
    public void setTime (int time){
        this.time=time;
        
    }    
    public void setRate(double rate){
        this.rate=rate;
        
        
    }
    public void calculate(){
     double interest=(principle*rate*time)/100;
        System.out.println("Interest for the "+ time + " year:" +interest+ "%");
        
    }
    
    
}
