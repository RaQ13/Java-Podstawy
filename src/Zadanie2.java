//Zapytaj użytkownika o wiek, jeżeli ma mniej niż 18
//powiadom że nie może kupić alkoholu, jeżeli więcej
//podziękuj za zakupy

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner kasa = new Scanner(System.in);
        System.out.println("podaj wiek");
        int wiek = kasa.nextInt();
        if (wiek > 18) {
            System.out.println("dziekuje za zakupy");
        } else {
            System.out.println("nie masz 18 lat, nie możesz kupić alkoholu");
        }
    }
}
