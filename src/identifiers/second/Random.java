package identifiers.second;

import identifiers.first.Parent;

public class Random {

    //klasa w tej samej paczce, która nie rozszerza klasy nie ma dostępu do
    // pól/metod private
    // pól/metod default
    // pól/metod protected

    public void testIdentifier(){
        Parent parent = new Parent();

        System.out.println(parent.first);
//        System.out.println(parent.second); //brak dostępu do pola default
//        System.out.println(parent.third); //brak dostępu do pola protected
//        System.out.println(parent.fourth); //brak dostępu do pola private
        parent.firstMethod();
//        parent.secondMethod(); //brak dostępu do metody default
//        parent.thirdMethod(); //brak dostępu do metody protected
//        parent.fourthMethod(); //brak dostępu do metody private
    }
}
