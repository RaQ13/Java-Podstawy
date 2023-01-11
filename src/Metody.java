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
}
