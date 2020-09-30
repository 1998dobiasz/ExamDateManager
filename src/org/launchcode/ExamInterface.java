package org.launchcode;

import java.util.Date;

public interface ExamInterface extends Comparable {

    void SetExamDay(Date day);
    boolean ExamDay(Date day);
    @Override
    default int compareTo(Object o) {
        return 0;
    }
}
