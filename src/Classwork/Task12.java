package Classwork;

public class Task12 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 21) - 10);
            System.out.println(arr[i]);
        }
        MaxAndMin(arr);

    }

    static void MaxAndMin(int[] mass) {
        int max = 0;
        int min = 0;
        int tmp1, tmp2;

        for (int i = 0; i < mass.length; i++) {
            if (max < mass[i] && mass[i] > 0) {
                //max = mass[i];
            max = Math.max(max, mass[i]);
            tmp1 = mass[i];
            }
        }
        System.out.println("max = " + max);
        for (int j = 0; j < mass.length; j++) {
            if (min > mass[j] && mass[j] < 0) {
                min = Math.min(min, mass[j]);
                tmp2 = mass[j];
            }
        }
        System.out.println("min = " + min);

    }

}