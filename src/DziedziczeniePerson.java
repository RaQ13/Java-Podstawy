public class DziedziczeniePerson { //ikonka przy numerze linii wskazuje na wystąpienie dziedziczenia

    public String name;
    public int age;

    public DziedziczeniePerson(String name, int age){
        System.out.println("Jestem w konstruktorze Person");
        this.name = name;
        this.age = age;
    };

    public void eat() {
        System.out.println("I like pizza");
    }

    public void walk() {
        System.out.println("I like walking");
    }
}
