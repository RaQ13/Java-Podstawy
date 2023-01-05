public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstVal = true;
        boolean secondVal = false;
        boolean thirdVal = false;
        boolean fourthVal = true;

        // &&  i -> true wtedy gdy wyrażenia skladowe spełniaja warunek
        System.out.println(firstVal && secondVal); //false
        System.out.println(firstVal && fourthVal); //true
        System.out.println(secondVal && thirdVal); //false

        // || lub -> true gdy 1 wyrażenie składowe spełnia warunek
        System.out.println(firstVal || secondVal); //true
        System.out.println(firstVal || fourthVal); //true
        System.out.println(secondVal || thirdVal); //false

        // ! negacja -> zwraca wartośćprzeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstVal); //false
        System.out.println(!secondVal); //true
        System.out.println(firstVal&&secondVal); //false
        System.out.println(!(firstVal&&secondVal)); //true
    }
}
