package org.launchcode;

import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        OverlapChecker list = new OverlapChecker();
        ReaderAndWriter r = new ReaderAndWriter();
        try {
            r.read(list,"Exams.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
       DifficultExam b = new DifficultExam("Feka",25);
        list.insert(b);
        list.randomExamDay();
        list.Print();
        //System.out.println("\n");
        list.matchExam(new Date(2020, 5, 15));
        list.deletion(b);
        try {
           r.outWrite(list,"Exams.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
