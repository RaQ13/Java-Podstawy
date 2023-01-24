package drivers;

public class WebDriverSecondTest {

    public static void main(String[] args) {
        Zadanie8WebDriver chrome = new ChromeDriverZadanie8();
        Zadanie8WebDriver secondChrome= new ChromeDriverZadanie8();

        Zadanie8WebDriver firefox = new FirefoxDriverZadanie8();
        Zadanie8WebDriver firefoxSecond = new FirefoxDriverZadanie8();
        Zadanie8WebDriver firefoxThird = new FirefoxDriverZadanie8();

        //klasa anonimowa

        //klasa anonimowa posiada tylko 1 instancje, czyli jeden obiekt

        Zadanie8WebDriver safari = new Zadanie8WebDriver() {
            @Override
            public void get() {
                System.out.println("Otwieram stronę z Safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Znajduje Element za pomocą Safari");
            }
        };
        safari.get();
        safari.findElementBy();
    }
}
