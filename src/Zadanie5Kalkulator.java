public class Zadanie5Kalkulator {

    public void Dodawanie(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("Wynik dodawania liczb " + number1 + " i " + number2 + " to " + result);
    }
    public void Odejmowanie(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("Wynik odejmowania liczb " + number1 + " i " + number2 + " to " + result);
    }
    public void Mnożenie(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("Wynik mnożenia liczb " + number1 + " i " + number2 + " to " + result);
    }
    public void Dzielenie(int number1, int number2) {
        while (number2 == 0 ) {
            System.out.println("Nie możesz dzielić przez 0, wybierz inną liczbę!");
        }
        float result = number1 / number2;
        System.out.println("Wynik dzielenia liczb " + number1 + " i " + number2 + " to " + result);
    }
    public void Reszta(int number1, int number2) {
        int result = number1 % number2;
        System.out.println("Wynik reszty z dzielenia liczb " + number1 + " i " + number2 + " to " + result);
    }
}
