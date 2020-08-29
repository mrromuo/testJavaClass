package FileTesting;

import java.io.*;

import static FileTesting.FileMain.NewFileName;

public class CustomFilterWriter {
    void writer(String text){
        try{
            FileWriter fileWriter = new FileWriter(NewFileName);
            MyFilterWriter myfilterWriter = new MyFilterWriter(fileWriter);
            myfilterWriter.write(text);
            myfilterWriter.write(";");
            myfilterWriter.close();
        }catch (IOException e){e.printStackTrace();}
        System.out.println("At File "+NewFileName+" new writen text is "+ text);
    }

}
class MyFilterWriter extends FilterWriter {
    MyFilterWriter(Writer out) {
        super(out);
    }
    public void write(String str) throws IOException {
        super.write(str.toLowerCase());
    }
}
