public class Bike implements Vehicle { // po wpisaniu alt+enter -> implement method

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę rowerem z prędkością " + speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowem, naciskam mocno na pedały");
    }

    @Override
    public String info() {
        return "rower";
    }
}
