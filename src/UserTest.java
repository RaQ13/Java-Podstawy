public class UserTest {

    public static void main(String[] args) {

        User user = new User(); //tworzy nowy obiekt klasy user, dlatego można dostać
        //instrukcję z konstruktora
        User user2 = new User("Gienek", "passs"); // można użyć gdy zadeklarowany jest
        //konstruktor przyjmujacy arhumenty

        user.username = "Władek";
        user.password = "QWERTY";
        user.sayHello();
    }
}
