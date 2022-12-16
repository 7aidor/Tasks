/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task_5;
import java.util.Scanner;
/**
 *
 * @author ascom
 */
public class Task_5 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String x = input.nextLine();
        System.out.println(x.replace(',','\0'));
    }
}