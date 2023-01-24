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

 /** Z enum */
//        Zadanie8WebDriver driver = getDriver(DriverType.CHROME);
//        Zadanie8WebDriver driver = getDriver(DriverType.FIREFOX);
//        Zadanie8WebDriver driver = getDriver(DriverType.SAFARI);
 /** Z enum z polami */
          Zadanie8WebDriver driver = getDriver(DriverType.FIREFOX);
//          Zadanie8WebDriver driver = getDriver(DriverType.CHROME);

        /** Iterwanie po enumie */
//        DriverType.values(); podejrz co zwraca
        DriverType[] driverTypes = DriverType.values();
        for (int i = 0; i < driverTypes.length; i++) {
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }



//        Zadanie8WebDriver driver = getDriver("dsa");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

    /** enum bez pól */

//    private static Zadanie8WebDriver getDriver(DriverType type) throws NoValidBrowserName {
//        if (type == DriverType.CHROME) {
//            return new ChromeDriverZadanie8(); // zwracanie obiektu
//        }
//        else if (type == DriverType.FIREFOX) {
//            return new FirefoxDriverZadanie8();
//        }
////        return null; // domyślna wartość
//        throw new NoValidBrowserName("No valid browser name"); // z enum teoretycznie niepotrzebne
//    }

    /** enum z polami */

        private static Zadanie8WebDriver getDriver(DriverType type) {
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriverZadanie8(); // zwracanie obiektu
        }
        else if (type.name.equals("firefox")) {
            System.out.println(type.path);
            return new FirefoxDriverZadanie8();
        }
        return null;
    }

    /** checked */

//    private static Zadanie8WebDriver getDriver(String name) throws NoValidBrowserName {
//        if (name.equals("chrome")) {
//            return new ChromeDriverZadanie8(); // zwracanie obiektu
//        }
//        else if (name.equals("firefox")) {
//            return new FirefoxDriverZadanie8();
//        }
////        return null; // domyślna wartość
//        throw new NoValidBrowserName("No valid browser name");
//    }

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
