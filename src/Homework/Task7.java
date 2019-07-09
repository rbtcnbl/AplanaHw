package Homework;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

// 0 - без штрафа
// 1 - маленький штраф
//2 - большой штраф
// 60 и м = 0
//61-80  = 1
//81 и б  = 2
//если др  +5 к скорости
//текущаю дата рандом, др с клавиатуры
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите скорость: ");
        Scanner sc = new Scanner(System.in);
        double spd = sc.nextDouble();

        LocalDate randomDate = createRandomDate(2018, 2019);
        Month month = randomDate.getMonth();
        int d = randomDate.getDayOfMonth();
        int m = month.getValue();
        System.out.println("Сегодня: " + randomDate);

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(calendar.YEAR, 1997);
        calendar.set(calendar.MONTH, Calendar.FEBRUARY);
        calendar.set(calendar.DAY_OF_MONTH, 18);
        int mth = calendar.get(calendar.MONTH);
        int dy = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println("День рождения: " + calendar.getTime());

        OurSpeed(spd, d, m, mth, dy);
    }

    static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);
        return LocalDate.of(year, month, day);
    }

    static void OurSpeed(double speed, int a, int b, int c, int d) {
        //double speed = 0;
        if (a != c && b != d) {
            if (speed <= 60) System.out.print("0 - без штрафа");
            if (speed >= 61 & speed <= 80) System.out.print("1 - маленький штраф");
            if (speed >= 81) System.out.print("2 - болшой штраф");
        } else if (a == c && b == d) {
            if (speed <= 65) System.out.print("0 - без штрафа");
            if (speed >= 66 & speed <= 85) System.out.print("1 - малеький щтраф");
            if (speed >= 85) System.out.print("2 - большой штраф");
        }
    }
}

