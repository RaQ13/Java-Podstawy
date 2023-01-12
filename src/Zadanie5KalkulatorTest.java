import java.util.Scanner;

public class Zadanie5KalkulatorTest {

    public static void main(String[] args) {

        Zadanie5Kalkulator dzialania = new Zadanie5Kalkulator();
        Scanner liczby = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int number1 = liczby.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int number2 = liczby.nextInt();

        System.out.println("Wybierz działanie: ");
        System.out.println("1 - Dodawanie");
        System.out.println("2 - Odejmowanie");
        System.out.println("3 - Mnożenie");
        System.out.println("4 - Dzielenie");
        System.out.println("5 - Reszta z dzielenia");

        int wybrane = liczby.nextInt();

        switch (wybrane) {
            case 1:
                dzialania.Dodawanie(number1, number2);
                break;
            case 2:
                dzialania.Odejmowanie(number1, number2);
                break;
            case 3:
                dzialania.Mnożenie(number1, number2);
                break;
            case 4:
                dzialania.Dzielenie(number1, number2);
                break;
            case 5:
                dzialania.Reszta(number1, number2);
                break;
            default:
                System.out.println("Wybierz prawidłową opcję");
        }


    }
}
