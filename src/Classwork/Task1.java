package Classwork;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        System.out.println("Введите два числа: ");
       Scanner sc = new Scanner(System.in);
       double n1 = sc.nextDouble();
       double n2 = sc.nextDouble();
       TwoNumb(n1,n2);
    }
    static void TwoNumb(double a, double b){
        double n3 = a;
        if (n3<0){
            n3 = -n3;
        }
        double n4 = b;
        if (n4<0){
            n4 = -n4;
        }
        if (Math.abs(n3-10)<Math.abs(n4-10)) {
        System.out.println(n3);
        } else {
            System.out.println(n4);
        }
        }
    }

