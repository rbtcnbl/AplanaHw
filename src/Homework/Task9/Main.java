package Homework.Task9;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("Курск", 709, "12:00"));
        trains.add(new Train("Москва", 500, "05:50"));
        trains.add(new Train("Анапа", 107, "06:15"));
        trains.add(new Train("Курск", 78, "14:00"));
        trains.add(new Train("Курск", 63, "23:45"));


        Collections.sort(trains, Train.COMPARE_BY_NUMBOFTRAIN);
        System.out.println(trains.toString());

        System.out.println("Enter number of train: ");
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        for (Train train : trains){
            if(train.getNumbOfTrain().equals(number)){
                System.out.println(train.toString());
            }}

        Collections.sort(trains, Train.COMPARE_BY_ARRIVALPLACE);
        for (int i = 0; i<trains.size(); i++){
            for(int j = 0; j<trains.size(); j++){
                if(trains.get(i).getArrivalPlace().equals(trains.get(j).getArrivalPlace())){
                    Collections.sort(trains, Train.COMPARE_BY_TIME);

                }
            }

            }
        System.out.println(trains.toString());
        }
    }


