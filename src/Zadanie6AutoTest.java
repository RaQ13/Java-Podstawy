public class Zadanie6AutoTest {

    public static void main(String[] args) {

        Zadanie6Auto audi = new Zadanie6Auto(); // krzysta z konstruktora bez argumentów

        audi.marka = "Audi"; //przypisywane na sztywno
        audi.model = "A5";
        audi.rok = 2022;
        audi.przebieg = 0;

        audi.Info();

        Zadanie6Auto audi2 = new Zadanie6Auto("Audi", "A5", 2021, 1000);
        //korzysta z konstruktora z argumentami

        audi2.Info();

        Zadanie6Auto mercedes = new Zadanie6Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1000;

        mercedes.Info();

        Zadanie6Auto mercedes2 = new Zadanie6Auto("Mercedes", "Klasa A", 2022, 0);

        mercedes2.Info();
    }
}
