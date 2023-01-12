public class Zadanie6Auto {

    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    public Zadanie6Auto () {}
    public Zadanie6Auto(String marka, String model, int rok, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
    }

    public void Info(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok: " + rok);
        System.out.println("Przebieg: " + przebieg);
        System.out.println(" ");
    }
}
