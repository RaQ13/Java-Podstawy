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
}
