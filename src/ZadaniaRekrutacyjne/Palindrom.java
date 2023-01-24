package ZadaniaRekrutacyjne;

public class Palindrom {

    // kajak
    // sedes
    // zakaz
    // radar
    // owocowo

    public static void main(String[] args) {
        System.out.println(isPalindrom("owocowo"));
    }

    public static boolean isPalindrom(String word) {
        int n = word.length();

        for (int i = 0; i < (n/2); i++) {
            if (word.charAt(i) != word.charAt(n - i -1)) {
                return false;
            }
        }
        return true;
    }
}
