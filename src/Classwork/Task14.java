package Classwork;
import java.util.Scanner;

public class Task14 {
    public static void main (String[] args){
        System.out.println("Введите размер массива: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String arr[] = new String[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.print ("Массив имеет вид:");
        for (int i = 0; i < size; i++) {
            System.out.println (" " + arr[i]);
        }
        LongWord(arr);
        ShortWord(arr);
    }

    static void LongWord(String[] mass){
        String max = "";
        for(int i = 0; i < mass.length; i++){
            if(mass[i].length() >= max.length()){
                max = mass[i];
            }
        }
        System.out.println("Max = " + max);
    }

    static void ShortWord(String[] mass){
        String min = "                                ";
        for(int i = 0; i < mass.length; i++){
            if(mass[i].length() <= min.length()){
                min = mass[i];
            }
        }
        System.out.println("Min = " + min);
    }
}
