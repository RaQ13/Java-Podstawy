package drivers;

public class WebDriverTest {

    public static void main(String[] args) throws NoValidBrowserName{

//        drivers.ChromeDriverZadanie8 chrome = new drivers.ChromeDriverZadanie8();
//        chrome.get();
//        chrome.findElementBy();
//
//        drivers.FirefoxDriverZadanie8 firefox = new drivers.FirefoxDriverZadanie8();
//        firefox.get();
//        firefox.findElementBy();

        // z użyciem polimorfizmu bez duplikacji kodu

        Zadanie8WebDriver driver = getDriver("dsa");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

    private static Zadanie8WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new ChromeDriverZadanie8(); // zwracanie obiektu
        }
        else if (name.equals("firefox")) {
            return new FirefoxDriverZadanie8();
        }
//        return null; // domyślna wartość
        throw new NoValidBrowserName("No valid browser name");
    }

    /** jeżeli wyjatek unchecked */

    //unchecked powinny być deklarowane w przypadku ewidentnego błędu programisty
    //przykłąd poniżej nie powinien być deklarowany z unchecked

//    private static Zadanie8WebDriver getDriver(String name) {
//        if (name.equals("chrome")) {
//            return new ChromeDriverZadanie8(); // zwracanie obiektu
//        }
//        else if (name.equals("firefox")) {
//            return new FirefoxDriverZadanie8();
//        }
////        return null; // domyślna wartość
//        throw new NoValidBrowserName("No valid browser name");
//    }
}
