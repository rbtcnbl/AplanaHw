package Classwork;

import java.util.Scanner;

public class Task4 {

    public static int numb;

    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        Table(n1,numb+1);

    }

    static void Table(int a, int b){
        //int result = a * b;
        System.out.println(a + " * " + b + " = " + a*b);
        b++;
        System.out.println(a + " * " + b + " = " + a*b);
        b++;
        System.out.println(a + " * " + b + " = " + a*b);
        b++;
        System.out.println(a + " * " + b + " = " + a*b);
        b++;
        System.out.println(a + " * " + b + " = " + a*b);
        b++;
        System.out.println(a + " * " + b + " = " + a*b);
        b++;
        System.out.println(a + " * " + b + " = " + a*b);
        b++;
        System.out.println(a + " * " + b + " = " + a*b);
        b++;
        System.out.println(a + " * " + b + " = " + a*b);
        b++;
        System.out.println(a + " * " + b + " = " + a*b);
        b++;
    }
}
