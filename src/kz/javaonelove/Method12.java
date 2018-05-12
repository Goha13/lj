package kz.javaonelove;

import java.util.Scanner;

public class Method12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input the size of matrix:");
        int n=in.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((int)(Math.random()*3)+" ");
            }
            System.out.println();
        }
    }
}
