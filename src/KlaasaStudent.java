public class KlaasaStudent {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public static String nazwaUczelni = "AGH";


    public void przedstawSie(){
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
    public void zalogujSie(){
        System.out.println("Loguje się za pomocą " + nick);
    }

    public void podajNrIndeksu(){
        System.out.println("Moj numer indeksu: " + numerIndeksu);
    }

    public void podajEmail(){
        System.out.println("Moj email to: " + email);
    }

    //public - identyfikator dostępu
    //static - słowo kluczowe
    //void - zwracany typ
    public static void infoUczelnia () { //metoda statczna
        //w metodzie statycznej można odwoływac się do pól statycznych
        System.out.println("Moja uczelnia to " + nazwaUczelni); //pole statyczne nazwaUczelni

        //nie można się odwołać do pól które są zależne od stworzenia obiektu
//        System.out.println("Nazywam się " + imie + " " + nazwisko);

        //nie da się wywołać metody, która nie jest statyczna wewnatrz metody statycznej
//        przedstawSie()

        //można odwołać się do metody statycznej wewnątrz innej metody statycznej
        drugaMetoda();
    }

    public static void drugaMetoda() {
        System.out.println("Jestem drugą metodą statyczną");
    }


}
