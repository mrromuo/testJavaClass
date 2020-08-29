package BufferedWriterExample;

public class main {
    public static void main(String args[]){
        BufferedWriterExample br=new BufferedWriterExample();
        br.FWraite("d:\\test.txt",false);
        BufferedReaderExample Bd=new BufferedReaderExample("d:\\test.txt");
        Bd.Reader();

    }
}
