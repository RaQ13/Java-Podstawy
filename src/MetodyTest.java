public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
//        metody.policzWynik();
//        metody.policzWynik();
//        metody.policzWynik();
//        metody.policzWynik();
//
//        int result = metody.pobierzWynik();
//        int result2 = result * 2;
//        System.out.println("Rezultat przed mnożeniem to: " + result);
//        System.out.println("Rezultat po mnożeniu to " + result2);

        metody.pobierzWynikParam(2);
        metody.pobierzWynikParam(100);
        metody.pobierzWynikParam(23);
        metody.pobierzWynikParam(2303);

        metody.add(2,3, "wynik");
        System.out.println(metody.add(2,3, "wynik")); //moża wypisać to co zwraca metoda w return
        int result = metody.add(8,10, "wynik"); // można przypisać do zmiennej
        System.out.println(result);
    }
}
