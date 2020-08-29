package FileTesting;

public class FileMain {
    public static final String NewFileName="D:\\MyData01.csv";
    public static creatAfile creatfile = new creatAfile();
    public static void main(String[] args) {
        boolean isFileDone = creatfile.newFile(NewFileName);
        if (isFileDone) {
            CustomFilterWriter cfw=new CustomFilterWriter();
            cfw.writer("Helow World");
        } else System.out.println("File not done! or Somthing going wrong!");

    }
}