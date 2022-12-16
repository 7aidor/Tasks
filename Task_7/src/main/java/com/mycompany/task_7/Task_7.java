/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task_7;
import java.util.Scanner;
/**
 *
 * @author ascom
 */
public class Task_7 {
     public static void swap(int[] arr ,int x,int y ){
        int n = arr[x];
        arr[x] = arr[y];
        arr[y]= n;
        }
     public static void main(String[] args) {
        System.out.println("Enter size:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter an array:");
        for (int i=0; i<size; i++){
            arr[i] = input.nextInt();
        }
        quickSort(arr,0,arr.length-1);
        for (int i=0; i<size; i++){
            System.out.print((arr[i]) + " ");
        }
        System.out.println(" ");
    }
    
    public static void quickSort(int[]arr, int low, int high){
        if(low>=high){
            return;
        }
        int x=low;
        int y=high;
        int pivot = arr[high];
        while(x<y){
            while(arr[x]<= pivot && x<y){
                x++;
            }
            while(arr[y]>= pivot && x<y){
                y--;
            }
            swap(arr, x , y );
        }
        swap(arr, x , high );
        quickSort(arr,low, x-1);
        quickSort(arr,x+1, high);
    }
}
