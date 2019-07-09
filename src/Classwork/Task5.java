package Classwork;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите три стороны: ");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        Triangle(n1,n2,n3);
    }

    static void Triangle(double a, double b, double c){
        if ((a+b)>c & (a+c)>b & (b+c)>a){
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
