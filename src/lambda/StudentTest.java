package lambda;

public class StudentTest {

    public static void main(String[] args) {
        Student it = new itStudent();
        sayHello("John", it, 24);

        Student med = new Student() {
            @Override
            public void sayHello(String name, int age) {
                System.out.println("I am med student");
                System.out.println("My name is " + name);
            }
        };
        sayHello("Johnatan", med, 31);

        //jeżeli mamy interfejs funckjonalny, czyli taki który ma 1 metodę, java łatwo rozpoznaję,
        //którą metodę tzreba nadpisać w klasie aononimowej i można skorzystać z lambdy

        /** lambda */

        //(parametr) -> System.out.println("I am not a student, my name is " + name);
        // jeżeli jeden parametr to nie musi byc w nawiasie np:
        // name nie jest w nawiasie
//        Student noStudent = name -> System.out.println("I am not a student, my name is " + name);
//        Student noStudent = (name, age) -> System.out.println("I am not a student, my name is " + name + " I am " + age);

        //lambda w bloku kodu zamiast w 1 linii

        Student noStudent = (name, age) -> {
            System.out.println("I am not a student, my name is " + name + " I am " + age);
            if (age < 12) {
                System.out.println("You cannot be a student");
            }
        };

        sayHello("Tom", noStudent, 20);
    }

    public static void sayHello(String name, Student student, int age) {
        student.sayHello(name, age);
    }
}
