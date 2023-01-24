package lambda;

public class itStudent implements Student {


    @Override
    public void sayHello(String name, int age) {
        System.out.println("I am it guy");
        System.out.println("My name is " + name);
    }
}
