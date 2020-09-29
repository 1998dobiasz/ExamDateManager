package org.launchcode;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OverlapChecker a = new OverlapChecker();

        Reader r = new Reader();
        try {
            r.Writter();
            r.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        DifficultExam b = new DifficultExam("Feka",25);
        a.insert(new DifficultExam("Matek",54));
        a.insert(new SimpleExam("Magyar",245));
        a.insert(new DifficultExam("Info",20));
        a.insert(new SeveralDaysExam("Tesi",3));
        a.insert(new DifficultExam("Angol",10));
        a.insert(b);
        a.Print();
        System.out.println("\n");
        a.deletion(b);
        a.Print();
    }
}
