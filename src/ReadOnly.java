public class ReadOnly {

    private String name = "Bartek"; //pole prywatne

//    public String getName() { //publiczna metoda zwracajaca pole prywatne //getter
//       return name = name + "Jest ok";
//    }
//
//    public void setName(String name) { //setter //ustawia wartość pola prywatnego
//        this.name = name;
//    }

    //w intellIJ można generować gettery i settery
    //alt + insert


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
