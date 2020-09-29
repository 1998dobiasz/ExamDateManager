package org.launchcode;

import java.util.Comparator;

public class DifficultExam implements ExamInterface {

    private  String subject;

    public String getSubject() {
        return subject;
    }

    private  int subjectImportance;

    public int getSubjectImportance() {
        return subjectImportance;
    }

    public DifficultExam(String subject , int importance) {
        this.subject = subject;
        this.subjectImportance = importance;
    }
    @Override
    public boolean freeDay(int time) {
        return false;
    }

    @Override
    public boolean overLaps(ExamInterface day) {
        return false;
    }

    @Override
    public String toString() {
        return ("Subject Name: " + subject + " Subject Importance: " + subjectImportance);
    }

    @Override
    public  int compareTo(Object o) {
        if (o.getClass() == DifficultExam.class)
            return this.subject.compareTo(((DifficultExam)o).getSubject());
        else if(o.getClass() == SeveralDaysExam.class)
            return this.subject.compareTo(((SeveralDaysExam)o).getSubject());
        else
            return this.subject.compareTo(((SimpleExam)o).getSubject());
    }
}
