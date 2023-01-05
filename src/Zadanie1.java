import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner calculator = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = calculator.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = calculator.nextInt();

        int add = a + b;
        int sub = a - b;
        int multi = a * b;
        float div = a / b;
        int mod = a % b;

        System.out.println("Wynik dodawania: " + add);
        System.out.println("Wynik odejmowania: " + sub);
        System.out.println("Wynik mnożenia: " + multi);
        System.out.println("Wynik mnożenia: " + div);
        System.out.println("Wynik reszty z dzielenia: " + mod);
    }
}
