public class KonwersjaCasting {

    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        /** konwersja */

        double c = a / b; // w tym przypadku java konwertuje niejwanie
        // liczbe typu int(stało przecinkową) na liczbe zmiennoprzecinkową

//        int d = a / b; // w tym przypadku nie można zrobić tego niejawnie gdyż straci się dane
        //w tym wypadku z b 4.23 straciloby się .23

        int d = a / (int)b;

        System.out.println(c);
        System.out.println(d);

        /** rzutowanie typów */

        Zadanie8WebDriver driver = new FirefoxDriverZadanie8();
//        FirefoxDriverZadanie8 firefoxDriver = driver; // zmienna driver zawiera ogólny typ i nie działa
        FirefoxDriverZadanie8 firefoxDriver = (FirefoxDriverZadanie8) driver; //rzutowanie typu
        driver.get();
    }
}
