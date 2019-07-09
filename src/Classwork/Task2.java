package Classwork;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        System.out.println("Введите номер месяца: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        MonthsFst(n1);
        MonthsSnd(n1);
    }
    static void MonthsFst(int m1){
        //int a = m1;
        if (m1 == 12 || m1 == 1 || m1 == 2){
            System.out.println("Now is winter");
}
        if (m1 == 3 || m1 == 4 || m1 == 5){
            System.out.println("Now is spring");
        }
        if (m1 == 6 || m1 == 7 || m1 == 8){
            System.out.println("Now is summer");
        }
       else if (m1 == 9 || m1 == 10 || m1 == 11){
            System.out.println("Now is autumn");
        }
    }
    static void MonthsSnd(int m2) {
switch (m2) {
    case 1:
    case 2:
    case 12:
        System.out.println("Now is winter");
        break;

    case 3:
    case 4:
    case 5:
        System.out.println("Now is spring");
        break;

    case 6:
    case 7:
    case 8:
        System.out.println("Now is summer");
        break;

    case 9:
    case 10:
    case 11:
        System.out.println("Now is autumn");
        break;
}
    }
}
