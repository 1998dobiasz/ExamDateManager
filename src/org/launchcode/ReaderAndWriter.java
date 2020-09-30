package org.launchcode;

import javax.swing.text.html.parser.Parser;
import java.io.*;

public class ReaderAndWriter {

    public void outWrite(OverlapChecker oc,String fileName) throws IOException {
         BufferedWriter br = new BufferedWriter(new FileWriter(fileName,false));
            br.write(oc.toString());
            br.flush();
            br.close();
    }
    public OverlapChecker read(OverlapChecker oc,String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        ExamInterface newExam;
                while ((line=br.readLine()) != null) {
                    String[] exam = line.split("<>");
                    String whichExam = exam[0];
                    String subject = exam[1];
                    int subjectImportance = Integer.parseInt(exam[2]);
                    if (whichExam.equals("DifficulExam")){
                         newExam = new DifficultExam(subject,subjectImportance);
                    }
                    else  if (whichExam.equals("SeveralDaysExam")){
                         newExam = new SeveralDaysExam(subject,subjectImportance);
                    }
                    else{
                         newExam = new SimpleExam(subject,subjectImportance);
                    }
                    oc.insert(newExam);
    }

                br.close();
                return oc;
        }
}
