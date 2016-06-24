/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infonep.area;

/**
 *
 * @author dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Area a = new Area();
        a.setBreadth(5);

        a.setLength(5);

        a.setHeight(5);

        a.area();

        a.volume();

        a.cube();

        a.cylinder();
    }

}
