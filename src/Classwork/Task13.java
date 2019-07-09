package Classwork;
 import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Введите числа и опеацию: 1 -add, 2 -sub, 3 -multi, 4 -div ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        int operation = sc.nextInt();

        if (operation == 1){
            System.out.println(add(num1,num2));
        }
        if (operation == 2){
            System.out.println(sub(num1,num2));
        }
        if (operation == 3){
            System.out.println(multi(num1,num2));
        }
        if (operation == 4) {
        System.out.println(div(num1,num2));
        }

    }

    static double add(double a, double b){
        double res = a + b;
        return res;
    }

    static double sub(double a, double b){
        double res = a - b;
        return res;
    }

    static double multi(double a, double b){
        double res = a * b;
        return res;
    }

    static double div(double a, double b){
        double res = a / b;
        return res;
    }
}
