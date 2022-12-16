/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task_6;

/**
 *
 * @author ascom
 */
public class circle {
    private float r;
    final double Pi = 3.14159;
    public void setR(float r) {
        this.r = r;
    } 
    public double premeter(){
          return Pi*r*2;
        }
    public double Area(){
        return r * r * Pi;
        }

    
    
    
}
