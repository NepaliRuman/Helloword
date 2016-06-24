/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infonep.marksheet;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String[]subject={"math","science","social","english","neplai"};
    Scanner input= new Scanner(System.in);
    int[]  marks=new int [subject.length];
     for(int i=0;i<subject.length;i++){
         System.out.println("Enter The Marks In "+subject[i]);
         marks[i]=input.nextInt();
         
        
     }
    }
    
}
