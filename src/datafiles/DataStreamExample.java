package datafiles;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DataStreamExample {
    void inputstream(){
        try{
            InputStream input = new FileInputStream("D:\\testout.txt");
            DataInputStream inst = new DataInputStream(input);
            int count = input.available();
            byte[] ary = new byte[count];
            inst.read(ary);
            for (byte bt : ary) {
                char k = (char) bt;
                System.out.print(k+"");
            }
        }catch (Exception e){System.out.println(e);}
    }
}
