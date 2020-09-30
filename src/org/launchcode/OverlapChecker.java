package org.launchcode;


import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

public class OverlapChecker {

    private LinkedList<ExamInterface> examsList = new LinkedList<ExamInterface>();

    public void insert(ExamInterface exam) {
        examsList.add(exam);
        Collections.sort(examsList);
    }

    public void deletion(ExamInterface exam){
       examsList.remove(exam);
        System.out.println("Exam was deleted");
    }

    public void Print(){
        for (var exams : examsList)
            System.out.println(exams);
    }
    private static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    public void randomExamDay(){
        for (var exams : examsList) {
            Date randomDay = new Date(2020, randBetween(4,9), randBetween(0,29));
            exams.setExamDay(randomDay);
        }
    }

    public void matchExam(Date examOrFree){
        boolean takeExam = false;
        for (var exams : examsList){
            if (exams.examOrFreeDay(examOrFree)){
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
        for (var exams : examsList)
            if (exams.getClass() == DifficultExam.class) {
                doc += "DifficultExam" + "<>" + ((DifficultExam) exams).getSubject()
                        + "<>" + ((DifficultExam) exams).getSubjectImportance() + "<>" + "\n";
            }
            else if(exams.getClass() == SeveralDaysExam.class) {
                doc += "SeveralDaysExam" + "<>" + ((SeveralDaysExam) exams).getSubject()
                        + "<>" + ((SeveralDaysExam) exams).getSubjectImportance() + "<>" + "\n";
            }
            else {
                doc += "SimpleExam" + "<>" + ((SimpleExam) exams).getSubject()
                        + "<>" + ((SimpleExam) exams).getSubjectImportance() + "<>" + "\n";
            }
        return doc;
    }
}