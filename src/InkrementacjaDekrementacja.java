public class InkrementacjaDekrementacja {

    public static void main(String[] args) {

        //INKREMENTACJA

        int a = 0;
        System.out.println("wartość a: " + a);

        //postinkrementacja
        //w wyniku postinkrementacji najapierw przypisana jesy wartość, następnie dopier
        //zwiększenie jej
        int b = a++;
        System.out.println("wartość b: " + b); //0
        System.out.println("wartość a: " + a); //1

        //preinkremenacja
        //najpierw zwiększana jest wartość po czym przypisana
        int c = ++a;
        System.out.println("wartość c: " + c); //2
        System.out.println("wartość a: " + a); //2

        //DEKREMENTACJA

        int d = 0;
        System.out.println("wartość d: " + d); // 0

        //postdekrementacja
        //w wyniku postdekrementacji następuje najpierw przypisawnie wartosci
        //po czym dopiero zmniejszenie wartości
        int e = d--;
        System.out.println("wartość e: " + e); // 0
        System.out.println("wartość d: " + d); // -1

        //predekrementacja
        int f = --d;
        System.out.println("wartość f: " + f); // -2
        System.out.println("wartość d: " + d); // -2

    }
}
