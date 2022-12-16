/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task_4;
import java.util.Scanner;
/**
 *
 * @author ascom
 */
public class Task_4 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Matrix dimensions: " );
        int a = input.nextInt();
        int b = input.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("Enter Matrix " );
        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Transposed Matrix is: \n" );
        for (int i=0; i<b; i++){
            for (int j=0; j<a; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("");
        }        
    }    
}
