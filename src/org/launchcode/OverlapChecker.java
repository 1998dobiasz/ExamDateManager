package org.launchcode;


import java.sql.SQLOutput;
import java.util.Collections;
import java.util.LinkedList;

public class OverlapChecker {

    private LinkedList<ExamInterface> exams = new LinkedList<ExamInterface>();

    public void insert(ExamInterface exam) {
        exams.add(exam);
        Collections.sort(exams);
    }

    public void deletion(ExamInterface exam){
       exams.remove(exam);
        System.out.println("Exam was deleted");
    }

    public void Print(){
        for (var exam : exams)
            System.out.println(exam);
    }





}