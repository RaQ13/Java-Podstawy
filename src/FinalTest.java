public class FinalTest {

    public static void main(String[] args) {
        final int x = 2; //nie można zmienic wartości przypisać wartośći do zmiennej typu final
        //x = 5 // Cannot assign a value to final variable 'x'

        final DziedziczeniePerson person = new DziedziczeniePerson("Włodek", 25);

        person.age = 24; //można zmienić wiek

        //final w typie obiektowym oznacza że do danego obiektu nie można przypisać nowego
        //ale można go edytować

//        person = new Person("Tom", 22); // nie można przypisać do Włodka -> Toma
    }
}
