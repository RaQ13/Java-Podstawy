public class WebDriverTest {

    public static void main(String[] args) {

        ChromeDriverZadanie8 chrome = new ChromeDriverZadanie8();
        chrome.get();
        chrome.findElementBy();

        FirefoxDriverZadanie8 firefox = new FirefoxDriverZadanie8();
        firefox.get();
        firefox.findElementBy();
    }
}
