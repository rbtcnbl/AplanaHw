package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива(не менее 4): ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr1[i]);
        }

        int arr2[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr2[i]);
        }
        HalfMass(arr1, arr2);
    }

    static void HalfMass(int[] mass, int[] twomass) {
        for (int i = 0; i < mass.length; i++) {
            int[] newMass1 = Arrays.copyOfRange(mass, 0, mass.length / 2);

            for (int j = 0; j < twomass.length; j++) {
                int[] newMass2 = Arrays.copyOfRange(mass, 0, twomass.length / 2);


                int[] combMass = new int[newMass1.length + newMass2.length];
                System.arraycopy(mass, 0, combMass, 0, mass.length);
                System.arraycopy(twomass, 0, combMass, mass.length, twomass.length);
                Mix(combMass);
                //System.out.println(combMass);
            }
        }

    }

    static void Mix(int[] a) {
        Random rnd = new Random();
        for (int i = 1; i < a.length; i++) {
            int j = rnd.nextInt(i);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            System.out.println(a);
        }
    }
}
