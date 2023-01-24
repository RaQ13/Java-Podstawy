package mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyTest {

    public static void main(String[] args) {


//        Map // podpowiada Map<K, V> K -> klucz(Key), V -> Wartość(Value)
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Basia");
        students.put(2, "Tomek");
        students.put(3, "Basia");
        students.put(2, "Krysia"); // można zadeklarować, skutkuje nadpisaniem

        System.out.println(students.get(1));
        System.out.println(students.get(2));

        Map<Integer, String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);

        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Paweł"));

        System.out.println(students.isEmpty());
        System.out.println(students.size());

        students.remove(1);
        System.out.println(students.size());

        for(Integer key: students.keySet()){
            System.out.println(key);
            System.out.println(students.get(key));
        }

        for (String student: students.values()) {
            System.out.println(student);
        }

    }
}
