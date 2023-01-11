public class AutoTest {

    public static void main(String[] args) {

        KlasaAuto mercedes = new KlasaAuto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        KlasaAuto audi = new KlasaAuto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2022;
        audi.przebieg = 0;

        audi.jedz();
        audi.hamuj();
        audi.info();

        KlasaAuto noname = new KlasaAuto();

        noname.hamuj();
        noname.jedz();
        noname.info();

        //jeżeli nieprzypisze sie wartości, zostaną wypisane wartości domyślne:
        // Dla typu obiektowego np. String to null, dla prtostego int to 0

    }
}
