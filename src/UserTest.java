public class UserTest {

    public static void main(String[] args) {

//        User user = new User(); //tworzy nowy obiekt klasy user, dlatego można dostać
        //instrukcję z konstruktora
        User user = new User("Gienek", "passs"); // można użyć gdy zadeklarowany jest
        //konstruktor przyjmujacy arhumenty

//        user.username = "Władek";
//        user.password = "QWERTY";

        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
