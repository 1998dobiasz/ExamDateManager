package org.launchcode;


import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

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
    private static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    public void randomExamDay(){
        for (var exam : exams) {
            Date randomDay = new Date(2020, randBetween(4,9), randBetween(0,29));
            exam.SetExamDay(randomDay);
        }
    }

    public void matchExam(Date examOrFree){
        boolean takeExam = false;
        for (var exam : exams){
            if (exam.ExamDay(examOrFree)){
                takeExam= true;
            }
        }

        if (takeExam == true){
            System.out.println("I will take an Exam this day");
        }
        else System.out.println("I wont take an Exam this day");
    }

    @Override
    public String toString() {
        String doc ="";
        for (var exam : exams)
            if (exam.getClass() == DifficultExam.class)
                doc += "DifficultExam" + "<>" + ((DifficultExam) exam).getSubject()
                + "<>" +((DifficultExam) exam).getSubjectImportance() + "<>" + "\n";
            else if(exam.getClass() == SeveralDaysExam.class)
                doc += "SeveralDaysExam" + "<>" + ((SeveralDaysExam) exam).getSubject()
                        + "<>" +((SeveralDaysExam) exam).getSubjectImportance() + "<>" + "\n";
            else
                doc += "SimpleExam" + "<>" +((SimpleExam) exam).getSubject()
                        + "<>" +((SimpleExam) exam).getSubjectImportance() + "<>" + "\n";
        return doc;
    }
}