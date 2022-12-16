/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author ascom
 */
public class Task_1 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter Ascii Code: ");
        int c = input.nextInt();
        char  s= (char) c;
        System.out.println("YOUR CHAR IS:" + s);
    }
}
