package FileTesting;

import java.io.File;
import java.io.IOException;

public class creatAfile {
    boolean newFile(String FileName){
        try {
            File file = new File(FileName);
            if (file.createNewFile()) {
                System.out.println("New File is created!, File Name is: " + FileName);
                return true;
            } else {
                System.out.println("File already exists.");
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
