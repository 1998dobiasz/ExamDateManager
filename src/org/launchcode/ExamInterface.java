package org.launchcode;

public interface ExamInterface extends Comparable {


    boolean freeDay(int time);
    boolean overLaps(ExamInterface day);
    @Override
    default int compareTo(Object o) {
        return 0;
    }
}
