public class PrzeciazanieMetodTest {

    public static void main(String[] args) {

        PrzeciazanieMetod metoda = new PrzeciazanieMetod();
//        metoda. //pokazuje wszystkie metody add które majatakie same nazwy ale różnią się iloscia parametrów
        metoda.add();
        metoda.add(1);
        metoda.add("Hello");
        metoda.add(3, 4);
        metoda.add(3, 5, 1);
    }
}
