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
public class Task_2 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N and R :");
        int N = input.nextInt();
        int R = input.nextInt();
        System.out.println("nPr = " + npr(N,R) + "\nnCr = " + ncr(N,R));
    }
    
public static int fact(int n){
    int s =1;
    for (int i=1; i <= n; i++){
        s *= i;
}
return s;
}

public static int npr(int n, int r){
    int s = fact(n)/fact(n-r) ;
    return s;
}
public static int ncr(int n, int r){
    int s = npr(n,r)/fact(r) ;
    return s;
}        
}


