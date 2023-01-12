public class Zadanie4StudentChecker {

    public static void main(String[] args) {

        //KlaasaStudent. // pokaże dostępne pole statyczne nazwaUczelni
        String uczelnia = KlaasaStudent.nazwaUczelni;

        KlaasaStudent student012 = new KlaasaStudent();

        student012.imie = "Ania";
        student012.nazwisko = "Kot";
        student012.nick = "Ktitty23";
        student012.email = "aniakot23@gmail.com";
        student012.numerIndeksu = 12;
        String uczelniaStudenta12 = student012.nazwaUczelni; //też ma dostęp do pola statycznego
        //ale nie po to jest pole statyczne

        KlaasaStudent student013 = new KlaasaStudent();

        student013.imie = "Grzegorz";
        student013.nazwisko = "Kupa";
        student013.nick = "GrigorK33";
        student013.email = "grzegorz.kupa@onet.pl";
        student013.numerIndeksu = 13;

        KlaasaStudent student014 = new KlaasaStudent();

        student014.imie = "Bonifacy";
        student014.nazwisko = "Loew";
        student014.nick = "Loowi";
        student014.email = "bon.loew@gmail.com";
        student014.numerIndeksu = 14;

        KlaasaStudent[] uczniowie = new KlaasaStudent[]{student012, student013, student014};

        for (int i = 0; i < uczniowie.length; i++){
            uczniowie[i].przedstawSie();
            uczniowie[i].zalogujSie();
            uczniowie[i].podajEmail();
            uczniowie[i].podajNrIndeksu();
            System.out.println(" ");
        }

    }
}
