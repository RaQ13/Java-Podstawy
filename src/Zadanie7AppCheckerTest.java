public class Zadanie7AppCheckerTest {

    public static void main(String[] args) {

        Zadanie7AndroidApp android = new Zadanie7AndroidApp("Asphalt 6");
        android.appInfo();
        android.runAndroidApp();

        Zadanie7IphoneApp iphone = new Zadanie7IphoneApp("Aparat");
        iphone.appInfo();
        iphone.runIphoneApp();
    }
}
