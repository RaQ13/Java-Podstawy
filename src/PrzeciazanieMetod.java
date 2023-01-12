public class PrzeciazanieMetod {

    public void add(int a, int b){
        System.out.println(a + b);
    }

//    public void add(int a, int b) { podpowiedź że już instenie taka metoda
    public void add(int a, int b, int c) { // po dodaniu kolejnego parametru jest ok
        System.out.println(a + b + c);
    }

    public void add(int a) {
        System.out.println(a);
    }

    public void add(String a) { //zmiana typu parametru też działa
        System.out.println(a);
    }

    public void add() { //metoda bez parametrów
        System.out.println(2+1);
    }
}
