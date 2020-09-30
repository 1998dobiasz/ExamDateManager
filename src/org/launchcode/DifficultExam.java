package org.launchcode;

import java.util.Comparator;
import java.util.Date;

public class DifficultExam implements ExamInterface {

    private  String subject;
    private Date day;

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
    public String toString() {
        return ("Subject Name: " + subject +","+ " Subject Importance: " + subjectImportance);
    }

    @Override
    public void setExamDay(Date day) {
        this.day= day;
    }

    @Override
    public boolean examOrFreeDay(Date day) {
        return this.day.equals(day);
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
