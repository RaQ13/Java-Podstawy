// Z DUZEJ LITERY
//umożliwiają korzystanei z metod

public class TypyDanychObiektowe {

    public static void main(String[] args) {

        //liczby stałoprzecinkowe
        Byte firstNumber = 127; // 1 bajt -128 do 127
        Short secondNumber = 32689; // 2 bajty -32768 do 32767
        Integer thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647
        Long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1 //duże L na końcu

        //liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; // 4 bajty max ok 6-7 liczb po przecinku // duże F na końu
        Double sixthNumber = 3.99999999999999D; // 8 bajtów - max ok 15 cyfr po przecinku
        // duże D na końcu

        //wartości logiczne
        Boolean prawda = true;
        Boolean falsz = false;

        //pojedyńczy znak
        Character letter = 'A';

        // ciągi znaków
        String hello = "hello aloha";

        System.out.println(hello.charAt(0));
    }
}
