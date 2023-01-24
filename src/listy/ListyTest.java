package listy;

import polimorfizm.document.PdfDcoument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {

    public static void main(String[] args) {
        //Li //podpowiada interfejs List<E> -> E oznacza przetrzymywany typ danych
        List<String> names = new ArrayList<>();
        names.add("Paweł");
        names.add("Kasia");
        names.add("Ola");
        names.add("Paweł");

        System.out.println(names.get(0));

        System.out.println(names.indexOf("Paweł")); //pokazuje pierwszy zgodny element
        System.out.println(names.lastIndexOf("Paweł")); //index ostatniego zgodnego elementu

        System.out.println(names.contains("Krysia")); //sprawdza czy lista zawiera
        System.out.println("Paweł");

        System.out.println(names.size()); //odpowiednik do taablicowego length

        System.out.println(names.isEmpty()); //czy puste

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.get(0));

        System.out.println(numbers.indexOf(1)); //pokazuje pierwszy zgodny element
        System.out.println(numbers.lastIndexOf(4)); //index ostatniego zgodnego elementu

        System.out.println(numbers.contains(2)); //sprawdza czy lista zawiera
        System.out.println(2);

        System.out.println(numbers.size()); //odpowiednik do taablicowego length

        System.out.println(numbers.isEmpty()); //czy puste

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);
        System.out.println(diffNames);

        //można Tworzyć listy z klasami, przy czy trzeba je uzupełnic obiektami danej klasy

        List<PdfDcoument> pdfDcouments = new ArrayList<>();
        pdfDcouments.add(new PdfDcoument());

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        /** Drugi sposób for dla listy */

        for(String name: names){
            System.out.println(name);
        }

    }
}
