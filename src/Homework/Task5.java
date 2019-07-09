package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr1[i]);
            System.out.println();
        }
        Sum(arr1);
    }

    static void Sum(int[] mass) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mass.length / 2; i++) {
            sum1 += mass[i];
            for (int j = mass.length - 1; j > mass.length / 2; j--) {
                sum2 += mass[j];

                if (sum1 == sum2) {
                    int[] newMass1 = Arrays.copyOfRange(mass, 0, mass.length / 2);
                    int[] newMass2 = Arrays.copyOfRange(mass, mass.length / 2, mass.length);
                    System.out.println("First mass: " + newMass1);
                    System.out.println("Second mass: " + newMass2);
                    System.out.println(sum1);

                }
                if (sum1 != sum2) {
                    System.out.println("Not sum");
                }
            }
        }
    }
}

