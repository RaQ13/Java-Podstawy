public class OperatoryMatematyczne {

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumer = 4.0F;

        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplation = firstNumber * secondNumber;
        float division = thirdNumer / secondNumber;
        int mod = secondNumber % firstNumber;

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmowania " + substraction);
        System.out.println("Wynik mnożenia " + multiplation);
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Wynik reszty z dzielenia " + mod);
    }
}
