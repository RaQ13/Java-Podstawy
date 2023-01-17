public class Truck implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę cieżarówką z prędkoscią " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje cięzarówką");
    }

    @Override
    public String info() {
        return "ciezarówka";
    }

    public void zatankuj(){
        System.out.println("aby mieć dużo siły muszę zjeść obiad");
    }

}
