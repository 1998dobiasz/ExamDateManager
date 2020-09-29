package org.launchcode;

import java.io.*;

public class Reader {

    public void outWrite(OverlapChecker oc,String fileName) throws IOException {
         BufferedWriter br = new BufferedWriter(new FileWriter(fileName,true));
            String line = oc.toString();
            br.write(line);
            br.flush();
            br.close();
    }
    public void read(OverlapChecker oc,String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
                String result = "";
                while (br.readLine().isEmpty()) {
                    result += br.readLine();
                }
                System.out.println(result);
                br.close();
        }
    }
