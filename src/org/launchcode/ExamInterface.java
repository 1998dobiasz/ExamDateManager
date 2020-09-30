package org.launchcode;

import java.util.Date;

public interface ExamInterface extends Comparable {

    void setExamDay(Date day);
    boolean examOrFreeDay(Date day);
    @Override
    default int compareTo(Object o) {
        return 0;
    }
}
