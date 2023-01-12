public class User {

    public String username;
    public String password;

    //konstruktor
    public User() {

    }

    //konstruktor
    public User(String username, String password) { //zwracanym typem jest obiekt danej klasy
        //nie podaje się się return ani nazwy, jest to metoda która wykona się automatycznie
        this.username = username;
        this.password = password;

//        username = user;
//        password = pass;
        System.out.println("Hello z konstruktora");
    }

    //jeżeli chcemy więcej konstruktorów to domyślny bez parametrów musi
    //byc jawnie zadeklarowany

    //jeżeli zakomentuje 2 wyżej to w klasie UserTest prawidłowym użcyiem kontruktora
    //będzie te, bez podanych parametrów

    public void sayHello() {
        System.out.println("Hello my name is " + username);
    }
}
