public class InstrukcjaElseIF {

    public static void main(String[] args) {

        int number = 0;

        if (number == 0) {
            System.out.println("liczba równa 0");
        } else if (number > 0) {
            System.out.println("liczba wieksza od 0");
        } else if (number > 10) {
            System.out.println("liczba wieksza od 10");
        } else if (number < -5){
            System.out.println("liczha mniejsza od -5");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }
    }
}
