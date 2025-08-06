/*Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.

     boolean isPal(String s) */

public class exercico5 {
    public static void main(String[] args) {
        exercico5 obj = new exercico5();
        String palavra = "arara";
        System.out.println(obj.ehPalindrome(palavra)); // true
        System.out.println(obj.ehPalindrome("java")); // false
        System.out.println(obj.convBase2(3)); // 11
        System.out.println(obj.convBase2(2)); // 10
        System.out.println(obj.convBase2(4)); // 100
        System.out.println(obj.convBase2(0)); // 0
        System.out.println(obj.convBase2(1)); // 1
        System.out.println(obj.convBase2(5)); // 101
        System.out.println(obj.convBase2(8)); // 1000           
    }

    public boolean ehPalindrome(String pal) {

        if (pal.length() <= 1) {
            return true;
        }

        if (pal.charAt(0) != pal.charAt(pal.length() - 1)) {
            return false;
        }

        return ehPalindrome(pal.substring(1, pal.length() - 1));
    }
    // 1. Modele e implemente um método recursivo que recebe um inteiro zero ou
    // positivo e retorna um String com o número em binário.
    // 011 = 3
    // 010 = 2
    // 100 = 4

    public String convBase2(int n) {
        if (n == 0) {
            return "0";
        }
        if (n >= 0) {
            if (n % 2 == 0)
                return new StringBuilder(convBase2(n / 2)).append("0").toString();
            else
                return new StringBuilder(convBase2(n / 2)).append("1").toString();
        }
        return null;
    }
}
