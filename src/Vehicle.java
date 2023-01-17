public interface Vehicle {

    void jazda(int speed); //deklaraca w interfejsie jest domyślnie publiczna
    void stop(); // nie trzeba deklarować jako typ public

    String info();
}
