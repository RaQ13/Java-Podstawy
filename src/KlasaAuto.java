public class KlasaAuto {

    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    public void jedz() {
        System.out.println("Jedź!");
    }

    public void hamuj() {
        System.out.println("Hamuj");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji " + rok);
        System.out.println("Przebieg: " + przebieg);
    }
}
