package Classwork;


import java.io.*;

public class Task9 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\rbtcnbl\\Desktop\\task9test";
        File file = new File(path);
FileReader fr = new FileReader(file);
        char [] a = new char[200];
        fr.read(a);

        for (char c : a)
System.out.println(c);
        fr.close();
        }
    }

