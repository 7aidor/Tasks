/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task_6;
import java.lang.Math;
/**
 *
 * @author ascom
 */
public class Triangle {
    private  float x;
    private  float y;
    private  float z;
            
    public float premeter(){  
       return x+y+z ;
        }
    
    public double Area(){
        float s = (x+y+z)/2 ;
        double area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        return area ;
        }

    public void setA(float a) {  
        this.x = a; 
    }

    public void setB(float b) {
        this.y = b;
    }

    public void setC(float c) {
        this.z = c;
    }  
}
