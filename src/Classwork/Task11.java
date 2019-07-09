package Classwork;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарной форме: ");
        String bin = sc.nextLine();
        FromBinToInt(bin);

    }

    static void FromBinToInt(String a) {
        int sum = 0;
        int b;
        char c;

        for (int i = 0; i < a.length(); i++) {
            c = a.charAt(a.length() - 1 - i);

           //if (c == '1' || c == '0'){
                if (c=='1') {
                    b = 1;
                } else { b = 0; }
            sum +=(b * Math.pow(2, i));
                }
        System.out.println(sum);

            }
        }


