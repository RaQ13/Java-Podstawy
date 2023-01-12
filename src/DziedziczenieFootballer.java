public class DziedziczenieFootballer extends DziedziczeniePerson{ //extends rozszerzenie klasy

    public String footballClub;

    public DziedziczenieFootballer(String name, int age, String footballClub) {
        super(name, age); // super wywołuje konstruktora klasy nadrzednej
        this.footballClub = footballClub;
//        super(name, age); //super musi być pierwszą instrukcją
        System.out.println("Jestem w konstruktorze Footballer");
    }

    public void playFootball() {
        System.out.println("I am playing football in " + footballClub);
    }
}
