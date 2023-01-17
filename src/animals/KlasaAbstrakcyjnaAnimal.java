package animals;

public abstract class KlasaAbstrakcyjnaAnimal { //klasa obstrakcyjna

    public final static int legs = 4;
    public abstract void sound();

    public void sayHello() {
        System.out.println("hello I am animal");
    }
}
