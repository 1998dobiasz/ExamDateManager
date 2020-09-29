package org.launchcode;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reader {

    public void Writter() throws IOException {
        FileOutputStream fos = new FileOutputStream("Exams.txt");
        fos.write(65);
        fos.flush();
        fos.close();


    }
    public void read() throws IOException {
        FileInputStream fis = new FileInputStream("Exams.txt");
                int i = 0;
                String result = "";
                while ((i = fis.read()) != -1) {
                    result += (char) i;
                }
                System.out.println(result);
                fis.close();
        }
    }
