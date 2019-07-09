package Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter words: ");
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        Words(word1, word2);

    }

    static void Words(String a, String b) {
        char symbol;
        char[] chArra = a.toCharArray();
        char[] chArrb = b.toCharArray();
        for (int i = 0; i < chArra.length; i++) {
            int count = 0;
            for (int j = 0; j < chArrb.length; j++) {
                if (chArra[i] == chArrb[j]) {
                    count = count + 1;
                    symbol = chArra[i];
                    if (count == 1) {
                        System.out.println(symbol);
                    }

                }
            }
        }
    }

}


