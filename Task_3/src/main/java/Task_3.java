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
public class Task_3 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n= input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter your array: ");
        
        for (int i=0; i<n; i++){
            arr[i]= input.nextInt();
        }
        int max = arr[0];
        for (int i=0; i<n; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("the max element is: "+max);
    }
}
