package ZapisywaniePlikow;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

        File file = new File("test.txt");
        if(file.delete()){ //delete zwraca boolean
            System.out.println("Usunęliśmy plik");
        } else {
            System.out.println("Nie udało się");
        }
    }
}
