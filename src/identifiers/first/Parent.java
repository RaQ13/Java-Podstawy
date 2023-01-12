package identifiers.first;

public class Parent {

    public String first = "public";
    String second = "default";
    protected String third = "protected";
    private String fourth = "private";



    public void firstMethod(){
        System.out.println("public");
    }
     void secondMethod(){
        System.out.println("default");
    }
    protected void thirdMethod(){
        System.out.println("protected");
    }
    private void fourthMethod(){
        System.out.println("private");
    }

    public void testIdentifiers() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }

    //w tej samej klasie mamy dostęp do wszystkich pól i metod

    //klasa dziedzicząca nie może się dostać do pól i medot private

    //klasa dziedziczącą ale w innej paczce ie może siędostac do pól i medot private oraz default

    //klasa niedziedzicząca ale tworzaca obiekt klasy nie ma dostępu tylko do pól i medot private

    //klasa niedziedzicząca i będąca w innej paczce ma tylko dostęp do pól i metod publicznych

}
