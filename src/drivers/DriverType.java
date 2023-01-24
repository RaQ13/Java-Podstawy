package drivers;

public enum DriverType {

    /** Enum bez pól */
//    CHROME,
//    FIREFOX

    /** Enum z polami */
    CHROME("chrome", "/src/resources/chromedriver.exe"),
    FIREFOX("firefox", "/src/resources/firefox.exe");

    String name;
    String path;

    DriverType(String name, String path){
        this.name = name;
        this.path = path;
    }

}
