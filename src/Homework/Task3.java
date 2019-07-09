package Homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(Words(text));
    }

    static String Words(String str) {
        String[] array = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].length() < array[j + 1].length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (String temp : array) {
            sb.append(temp).append(" ");
        }
        return sb.toString();
    }
}
