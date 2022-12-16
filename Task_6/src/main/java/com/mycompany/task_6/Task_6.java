/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task_6;
import java.util.Scanner;
/**
 *
 * @author ascom
 */
public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Enter 'c' for circle, or 't' for triangle: ");
        Scanner input = new Scanner(System.in);
        char choice = input.next().charAt(0);
        switch (choice){
            case 'c' :
                circle c1 = new circle();
                System.out.println("Enter radious: ");
                c1.setR(input.nextFloat());
                System.out.println("Premeter = "+ c1.premeter() + " , Area= " + c1.Area());
                break;
            case 't':
                Triangle t1 = new Triangle();
                System.out.println("Enter your triangle sides: ");
                t1.setA(input.nextFloat());
                t1.setB(input.nextFloat());
                t1.setC(input.nextFloat());
                System.out.println("Premeter = " + t1.premeter() + " , Area= " + t1.Area());
                break;
            default:
                System.out.println("Invalid");
        
        }
    }
}
