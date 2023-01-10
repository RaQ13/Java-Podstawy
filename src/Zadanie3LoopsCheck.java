public class Zadanie3LoopsCheck {

    public static void main(String[] args) {

        //liczby od 0 do 100 podzielne przez 3

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        //odwrócenie tablicy

        int[] Tablica = new int [] {1,3,5};

        //przykład 1

        for (int i = Tablica.length -1; i >= 0; i--) {
            System.out.println(Tablica[i]);
        }

        //przykład 2 faktyczne odwrócenie

        for (int i = 0; i < Tablica.length/2; i++) {
            int temp = Tablica[i];
            Tablica[i] = Tablica[Tablica.length - 1 - i];
            Tablica[Tablica.length -1 -i] = temp;
        }

        for (int i = 0; i < Tablica.length; i ++) {
            System.out.println(Tablica[i]);
        }

    }
}
