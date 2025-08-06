/*Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.

     boolean isPal(String s) */

public class exercico5 {
    public static void main(String[] args) {
        exercico5 obj = new exercico5();
        String palavra = "arara";
        System.out.println(obj.ehPalindrome(palavra)); // true
        System.out.println(obj.ehPalindrome("java")); // false
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
}
 