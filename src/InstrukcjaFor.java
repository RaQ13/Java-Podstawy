public class InstrukcjaFor {

    public static void main(String[] args) {

        // wypisuje od 1 do 100
        int number = 100;
        // i specjalna zmienna sterująca
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }

        //od 1 do 100 podzielne przez 5
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
