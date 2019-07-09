package Classwork;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        SortUp(n1,n2,n3);
        SortDown(n1,n2,n3);
    }
     static void SortUp(double a, double b,  double c){
        double[] arr = {a, b, c};

         for(int i = arr.length-1 ; i > 0 ; i--){
             for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                double tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
     } }
         }
         for(int i = 0; i <  arr.length; i++) {
             System.out.print(arr[i] + "  ");
         }
    }
     static void SortDown(double d, double e, double f){
         double[] arr = {d, e, f};

         for(int i = arr.length-1 ; i > 0 ; i--){
             for(int j = 0 ; j < i ; j++){
                 if( arr[j] < arr[j+1] ){
                     double tmp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = tmp;
                 } }
         }
         System.out.print(" : ");
         for(int i = 0; i <  arr.length; i++) {
             System.out.print(arr[i] + "  ");
         }

     }

}
