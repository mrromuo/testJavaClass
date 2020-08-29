package datafiles;

import java.io.*;
public class OutputExample {

    void outputexample () {
        try {
            FileOutputStream file = new FileOutputStream("D:\\testout.txt");
            DataOutputStream data = new DataOutputStream(file);
            //PrintWriter printWriter= new PrintWriter(file);
            //printWriter.println("Test");
            data.writeBytes("Java DataOutputStream class allows an application to write primitive Java data types to the output stream in a machine-independent way.\n" +
                    "\n" +
                    "Java application generally uses the data output stream to write data that can later be read by a data input stream.");
            data.flush();
            data.close();
            //printWriter.close();
            System.out.println("Succcess...");
        }catch (Exception e){System.out.println(e);}
    }
}
