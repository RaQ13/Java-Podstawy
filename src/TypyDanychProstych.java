//zawiera tylko "surowe dane"
// z małej litery
// nie ma możliwości korzystania z metod
public class TypyDanychProstych {

    public static void main(String[] args) {

        //liczby stałoprzecinkowe
        byte firstNumber = 127; // 1 bajt -128 do 127
        short secondNumber = 32689; // 2 bajty -32768 do 32767
        int thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647
        long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1 //duże L na końcu

        //liczby zmiennoprzecinkowe
        float fifthNumber = 4.99934F; // 4 bajty max ok 6-7 liczb po przecinku // duże F na końu
        double sixthNumber = 3.99999999999999D; // 8 bajtów - max ok 15 cyfr po przecinku
        // duże D na końcu

        //wartości logiczne
        boolean prawda = true;
        boolean falsz = false;

        //pojedyńczy znak
        char letter = 'A';


    }


// jeżeli ustawi sie większą wartość, inteli podświetli linie na czerwono
// z wytłumaczeniem

//    short test = 432689; // 2 bajty -32768 do 32767

//wyświetla sie błąd o tym że podaje do wartości short wartość która jest więszka
//czyli int
}
