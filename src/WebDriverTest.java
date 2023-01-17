public class WebDriverTest {

    public static void main(String[] args) {

//        ChromeDriverZadanie8 chrome = new ChromeDriverZadanie8();
//        chrome.get();
//        chrome.findElementBy();
//
//        FirefoxDriverZadanie8 firefox = new FirefoxDriverZadanie8();
//        firefox.get();
//        firefox.findElementBy();

        // z użyciem polimorfizmu bez duplikacji kodu

        Zadanie8WebDriver driver = getDriver("firefox");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

    private static Zadanie8WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriverZadanie8(); // zwracanie obiektu
        }
        else if (name.equals("firefox")) {
            return new FirefoxDriverZadanie8();
        }
        return null; // domyślna wartość
    }
}
