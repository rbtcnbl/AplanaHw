package Homework.Task8;
import java.util.Comparator;


public class Student {
    String name;
    String surname;
    Integer number_groupe;
    Integer ratings;

    public Student(String name,
                   String surname,
                   Integer number_groupe,
                   Integer ratings
    ) {
        this.name = name;
        this.surname = surname;
        this.number_groupe = number_groupe;
        this.ratings = ratings;

    }

    public void setRatings(Integer rat){
        ratings = rat;
    }
    public Integer getRatings(){
        return ratings;
    }

    public static Comparator<Student> COMPARE_BY_RATINGS = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.ratings.compareTo(o2.ratings);
        }
    };

    public String toString() {
        return this.name + " " + this.surname + " " + this.number_groupe + " " + this.ratings;
    }


}










