import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WyjatkiChecked {

    /**można z góry założyć, że metoda wyrzuci wyjątek*/


    //alt + enter add an exception
//    public static void main(String[] args) throws FileNotFoundException { //możemy poinfomować że dalej wyrzuca błąd
//        readFile("/src/dsds.txt"); // też pokazuje że nie istnieje
//    }
//
//    public static void readFile(String path) throws FileNotFoundException {
//        FileInputStream fileInputStream = new FileInputStream(path); // nie isntenieje
//    }

    /** try and catch */

        public static void main(String[] args) {
            try { // kod który chcemy spróbować wykonać ale mamy świadomosć że ten kod moze wyrzucić wyjatek
                System.out.println("Before reading file");
                readFile("/src/dsds.txt");
//                System.out.println("Closing file"); //nie tzreba wklejać w 2 miejscach
            } catch (FileNotFoundException e) { //łapiemy wyjątek, jeżeli złapany ten to wykonuje
                System.out.println("Wyjątek został wyrzucony");
                System.out.println(e.getMessage()); // wiadomość wyjatku
//                System.out.println("Closing file"); //nie tzreba wklejać w 2 miejscach
                throw new RuntimeException(e);
            } finally { //wykona się w obydwóch przypadkach
                System.out.println("Closing file");
            }
        }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
