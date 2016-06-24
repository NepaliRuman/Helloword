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
public class Area {

    private int length;
    private int height;
    private int breadth;

    private int area, volume, cube, cylinder;

    public void setLength(int length) {
        this.length = length;

    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;

    }

    public void setHeight(int height) {
        this.height = height;
    }

    //formula//
    public void area() {
        area = length * breadth;
        System.out.println("The Area Is Rectangle (A) : " + area + "cm2");

    }

    public void volume() {
        volume = length * breadth * height;
        System.out.println("The volume Is Rectangle : " + volume + "cm2");
    }

    public void cube() {
        cube = length * length * length;
        System.out.println("The Area Of A Cube : " + cube + "cm2");
    }

    public void cylinder() {
        cylinder = (22 / 7) * height;
        System.out.println("The Volume Of A Cylinder : " + cylinder + "cm2");
    }

}
