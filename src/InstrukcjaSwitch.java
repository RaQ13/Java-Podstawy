import java.util.Scanner;

public class InstrukcjaSwitch {

    public static void main(String[] args) {

        Scanner wybor = new Scanner(System.in);
        System.out.println("Wybierz Danie, możliwe do wyboru: 1. Pizza, 2. Łosoś, 3. Frytki");
        String danie = wybor.nextLine();

        switch(danie) {
            case "Pizza":
                System.out.println("Cena to 22zł");
                break;
            case "Łosoś":
                System.out.println("Cena to 35zł");
                break;
            case "Frytki":
                System.out.println("cena to 15zł");
                break;
            default:
                System.out.println("Nie mamy takiego Dania");
        }
    }
}
