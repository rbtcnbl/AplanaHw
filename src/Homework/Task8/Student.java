package Homework.Task8;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private String number_groupe;
    private String ratings;

    public Student(String name,
                   String surname,
                   String number_groupe,
                   String ratings
    ) {
        this.name = name;
        this.surname = surname;
        this.number_groupe = number_groupe;
        this.ratings = ratings;

    }

    public static void main(String[] args) {
       /* Student[] students = new Student[10];
        students[0]  = new Student("Иван", "Иваноа", "111", "4");
        students[1] = new Student("Ирина", "Селиванова", "515", "3");*/
        ArrayList students = new ArrayList();
        students.add(new Student("Иван", "Иваноа", "111", "4"));
        students.add(new Student("Ирина", "Селиванова", "515", "3"));
        students.add(new Student("Ольга", "Марочкина", "382", "4"));
        students.add(new Student("Николай", "Петров", "100", "5"));
        students.add(new Student("Василий", "Сидоров", "214", "5"));
        students.add(new Student("Олег", "Никоненок", "360", "2"));
        students.add(new Student("Мария", "Толкачева", "188", "3"));
        students.add(new Student("Олеся", "Горбулина", "512", "4"));
        students.add(new Student("Игорь", "Сапронов", "436", "5"));
        students.add(new Student("Петр", "Кривошеев", "200", "4"));
        System.out.println(students.toString());




    }
    /*public void Study(ArrayList<Student> students){
        int min_rat = 0;
        for (int i=0; i<students.size(); i++){

        }
    }*/

}


