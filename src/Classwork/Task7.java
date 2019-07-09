package Classwork;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        TrafficLight(n1);

    }

    static void TrafficLight(int a){
        int time = a%5;
        //for (int i = 0; i<=60; i+=5){
            if (time > 0 && time<=3){
                System.out.println("Green");
            }
            if (time>3 && time <= 4){
                System.out.println("Yellow");
            }
             if (time>4 && time <= 5 || time == 0) {
                System.out.println("Red");
            }
        }
    }

