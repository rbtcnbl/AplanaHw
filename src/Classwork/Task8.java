package Classwork;
 import java.io.*;
 import java.util.Scanner;

public class Task8 {
 public static void main(String[] args){
     File myFile = new File("text.txt");
         try {
             BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
             writer.write("Hi, world!! So happy day\n");
            writer.flush();
            writer.close();
        }   catch (IOException ex) {
            ex.printStackTrace();
        }
}
}
