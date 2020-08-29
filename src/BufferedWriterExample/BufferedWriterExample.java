package BufferedWriterExample;

import java.io.*;
import java.util.ArrayList;

public class BufferedWriterExample {
    ArrayList<String> temp=new ArrayList<>();
    public void FWraite(String FileName,boolean isaddtional) {

        if (isaddtional){
            FileReader fr = null;
            try {
                fr = new FileReader(FileName);
                BufferedReader br = new BufferedReader(fr);
                String name="";
                //System.out.println("Enter data: ");
                while(!name.equals("STOP")){
                    name=br.readLine();
                    if (name == null) break;
                    //System.out.println("data is: "+name);
                    temp.add(name);
                }
                br.close();
                fr.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int file_ln=temp.size();
        try {
            FileWriter writer = new FileWriter(FileName);
            BufferedWriter buffer = new BufferedWriter(writer);
            for (int i = 0 ; i<file_ln;i++){
                buffer.write(temp.get(i));
                buffer.newLine();
            }
            buffer.write("Welcome to javaTpoint.");
            buffer.newLine();
            buffer.write("Java BufferedReader class is used to read the text from a character-based input stream.");
            buffer.newLine();
            buffer.write("It can be used to read data line by line by readLine() method.");
            buffer.newLine();
            buffer.write("It makes the performance fast. It inherits Reader class.");
            buffer.close();
            System.out.println("Success");
        }catch (IOException e){e.printStackTrace();}
    }

}
