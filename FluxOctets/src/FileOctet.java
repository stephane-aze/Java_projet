import java.io.*;
import java.io.FileInputStream;


public class FileOctet {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("./src/input.txt");
        FileOutputStream out = new FileOutputStream("./src/output.txt", true);

        copy(in, out);

        in.close();
        out.close();
    }
    private static void copy(FileInputStream fileReader, FileOutputStream fileWriter) throws IOException {
        int c;
        while ((c = fileReader.read()) != -1) {
            fileWriter.write(c);
        }
    }

}
