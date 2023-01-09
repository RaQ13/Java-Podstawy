public class PetlaDoWhile {

    public static void main(String[] args) {

        int number = 5;
        //napierw wykonuje się do po czym dopiero sprawdza warunek
        //dlatego wykona się pierwsza fałszywa instrukcja nie zgadzająca się z warunkiem
        do {
            System.out.println("Moja wartość to " + number + " i jestem mniejsza od 20");
            number++;
        }
        while (number < 20);
    }
}
