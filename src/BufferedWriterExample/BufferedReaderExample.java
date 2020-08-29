package BufferedWriterExample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderExample {
    String FileName;

    public BufferedReaderExample(String fileName) {
        FileName = fileName;
    }

    public void Reader() {
        FileReader fr = null;
        int x=0;
        try {
            fr = new FileReader(FileName);
            BufferedReader br = new BufferedReader(fr);
            String name="";
            System.out.println("Enter data: ");
            while(!name.equals("STOP")){
                name=br.readLine();
                if (name == null) break;
                x++ ;
                System.out.println("data i#:"+x+" is: "+name);

            }
            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
