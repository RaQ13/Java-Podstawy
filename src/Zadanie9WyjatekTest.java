import java.util.Scanner;

public class Zadanie9WyjatekTest {

    public static void main(String[] args) throws Zadanie9Wyjatek{
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj swój wiek");
        int age = scanner.nextInt();
        if (age <= 18) {
            throw new Zadanie9Wyjatek("Nie jesteś pełnoletni");
        } else {
            System.out.println("Jesteś pełnoletni");
        }
    }
}
