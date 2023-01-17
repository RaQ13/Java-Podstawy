import drivers.ChromeDriverZadanie8;
import drivers.FirefoxDriverZadanie8;
import drivers.Zadanie8WebDriver;

public class WyjatkiPrzyklady {

    public static void main(String[] args) {

        /** Przykład 1 */

//        int[] numbers = new int[2];
//        numbers[0] = 1;
//        numbers[1] = 3;
//
//        for (int i = 0; i < numbers.length; i++) { // jeżeli <= Index 2 out of bounds for length 2
//            System.out.println(numbers[i]);
//        }

        /** Przykład 2 */

        Zadanie8WebDriver driver = getDriver("k"); //jeżeli złe dane
        // Cannot invoke "drivers.Zadanie8WebDriver.get()" because "driver" is null
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
