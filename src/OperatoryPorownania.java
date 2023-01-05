import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args) {

//        int firstNumber = 4;
//        int secondNumber = 6;

        Scanner porownania = new Scanner(System.in);
        System.out.println("podaj 1 liczbe");
        int firstNumber = porownania.nextInt();
        System.out.println("podaj 2 liczbe");
        int secondNumber = porownania.nextInt();

        boolean result = secondNumber > firstNumber;
        System.out.println("druga > pierwsza " + result);                     //true
        System.out.println("pierwsza > druga " + (firstNumber > secondNumber)); //false
        System.out.println("pierwsza < druga " + (firstNumber < secondNumber)); //true
        System.out.println("pierwsza >= druga " + (firstNumber >= secondNumber)); //false
        System.out.println("pierwsza <= druga " + (firstNumber <= secondNumber)); //true

        System.out.println("pierwsza == druga " + (firstNumber == secondNumber)); //false
        System.out.println("pierwsza != druga " + (firstNumber != secondNumber)); //true
    }
}
