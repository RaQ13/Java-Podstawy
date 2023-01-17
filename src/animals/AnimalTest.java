package animals;

public class AnimalTest {

    public static void main(String[] args) {
        KlasaAbstrakcyjnaAnimal dog = new Dog();
        dog.sound();
        KlasaAbstrakcyjnaAnimal cat = new Cat();
        cat.sound();
    }
}
