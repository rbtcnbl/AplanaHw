package Homework.Task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

       /* Student[] students = new Student[10];
        students[0]  = new Student("Иван", "Иваноа", "111", "4");
        students[1] = new Student("Ирина", "Селиванова", "515", "3");*/
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иваноа", 111, 4));
        students.add(new Student("Ирина", "Селиванова", 515, 3));
        students.add(new Student("Ольга", "Марочкина", 382, 4));
        students.add(new Student("Николай", "Петров", 100, 5));
        students.add(new Student("Василий", "Сидоров", 214, 5));
        students.add(new Student("Олег", "Никоненок", 360, 2));
        students.add(new Student("Мария", "Толкачева", 188, 3));
        students.add(new Student("Олеся", "Горбулина", 512, 4));
        students.add(new Student("Игорь", "Сапронов", 436, 5));
        students.add(new Student("Петр", "Кривошеев", 200, 4));

        Collections.sort(students, Student.COMPARE_BY_RATINGS);
        System.out.println(students.toString());

        for (Student student : students) {
            if (student.getRatings().equals(4) || student.getRatings().equals(5) ) {
                System.out.println("Студенты со среднимми оценками 4 и 5: " + student.toString());
            }
        }


    }


}
