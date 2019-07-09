package Classwork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
      Numbers(n1);
    }
    static void Numbers(double n){
        if (n<0) {
            System.out.println(n+1);
        }
        if (n>0) {
            System.out.println(n*2);
        }
        if (n==0) {
            System.out.println(0);
        }
    }
}
