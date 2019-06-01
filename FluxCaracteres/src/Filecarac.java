import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;


public class Filecarac {

    public static void main(String[] args) throws IOException {
        File file = new File("./src/output.txt");

        // creates the file
        file.createNewFile();
        FileReader inputStream = new FileReader("./src/input.txt");
        FileWriter outputStream = new FileWriter("./src/output.txt", true);
        int c ;
        while ((c=inputStream.read()) != -1){
            outputStream.write(c);
            int a = (1 << 16) | c;
            System.out.println(a);
            //outputStream.write(c);

        };
        outputStream.flush();
        outputStream.close();
        inputStream.close();
    }
}

