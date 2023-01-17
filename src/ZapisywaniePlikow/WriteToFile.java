package ZapisywaniePlikow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("test.txt");
        writer.write("Some tekst"); // nadpisuje tekst, jeżeli istnieje
        writer.close();
    }
}
