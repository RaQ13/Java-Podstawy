package animals;

public class Dog extends KlasaAbstrakcyjnaAnimal{
    @Override
    public void sound() {
        System.out.println("hau");
        sayHello();
        System.out.println("Number of legs " + legs);
    }
}
