package Homework;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int a = (int) Math.round((Math.random() * 9));
            System.out.print(a);
        }
        char[] array = new char[8];
        int rand;
        Random r = new Random();
        for (int i = 0; i < 2; i++) {
            rand = r.nextInt(122 - 97) + 1 + 97; // диапазоны ((max - min) + 1) + min
            array[i] = (char) rand;
        }
        for (char c : array)
            System.out.print(c);
        for (int j = 0; j < 4; j++) {
            int a = (int) Math.round((Math.random()));
            System.out.print(a);
        }
    }
}


