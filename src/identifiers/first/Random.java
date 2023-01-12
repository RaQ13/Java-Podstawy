package identifiers.first;

public class Random {

    //klasa w tej samej paczce, która nie rozszerza klasy nie ma dostępu do pól/metod private

    public void testIdentifier(){
        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
//        System.out.println(parent.fourth); //brak dostępu do pola private
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
//        parent.fourthMethod(); //brak dostępu do metody private
    }
}
