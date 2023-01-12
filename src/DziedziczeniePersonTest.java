public class DziedziczeniePersonTest {

    public static void main(String[] args) {
        DziedziczenieMathTeacher teacher = new DziedziczenieMathTeacher("Tom", 29, "University");

//        teacher.name = "Tom";
//        teacher.age = 29;
//        teacher.school = "University";
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMatch();

        System.out.println(" ");

        DziedziczenieFootballer footballer = new DziedziczenieFootballer("Mike", 21, "FC Holdy");
//        footballer.name = "Mike";
//        footballer.footballClub = "FC Holdy";
//        footballer.age = 21;
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }
}
