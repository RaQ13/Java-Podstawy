public class Metody {

    public void policzWynik() { //void oznacza że metoda nei zwraca żadnej wartości
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result +i;
        }
        System.out.println("Rezultat to: " + result);
    }

    public int pobierzWynik() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result +i;
        }
        System.out.println("Rezultat to: " + result);
       // return "hello" nie może zwrócić strniga bo zadeklarowany jest typ int
        return result;
    }

    public int pobierzWynikParam(int number) {
        System.out.println("Number ma wartość: " + number);
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result +i;
        }
        System.out.println("Rezultat to: " + result);
        // return "hello" nie może zwrócić strniga bo zadeklarowany jest typ int
        return result;
    }

    public int add(int firstNumber, int secondNumber, String word) { //mogą być podane różne typy danych
        System.out.println("Suma to: " + (firstNumber + secondNumber));
        //w sout first i second muszą być razem w nawiasie
        // w przeciwnym wypadku wynikiem będzie wypisanie liczb obok siebie zamiast dodania
        System.out.println(word);
        return firstNumber + secondNumber;
    }
}
