public class DziedziczenieMathTeacher extends DziedziczeniePerson {

    public String school;

    public DziedziczenieMathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
        System.out.println("Jestem w konstruktorze MathTeacher");
    }

    public void walk(){
        System.out.println("I walk very fast");
    }

    public void teachMatch() {
        System.out.println("I am teaching math");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age + " years old");
    }
}
