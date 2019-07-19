package Homework.Task9;

import java.sql.Time;
import java.util.Comparator;
import java.util.List;

public class Train {
    String arrivalPlace;
    Integer numbOfTrain;
    String time;

    public Train(String arrivalPlace,
            Integer numbOfTrain,
            String time
    ){
        this.arrivalPlace = arrivalPlace;
        this.numbOfTrain = numbOfTrain;
        this.time = time;
    }

    public Integer getNumbOfTrain(){
        return numbOfTrain;
    }
    public String getArrivalPlace(){
        return arrivalPlace;
    }

    public static Comparator<Train> COMPARE_BY_NUMBOFTRAIN = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.numbOfTrain.compareTo(o2.numbOfTrain);
        }
    };

    public String toString() {
        return this.arrivalPlace + " " + this.numbOfTrain + " " + this.time;
    }

    public static Comparator<Train> COMPARE_BY_ARRIVALPLACE = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.arrivalPlace.compareTo(o2.arrivalPlace);
        }
    };

    public static Comparator<Train> COMPARE_BY_TIME = new Comparator<Train>() {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.time.compareTo(o2.time);
        }
    };


}
