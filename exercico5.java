/*Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.

     boolean isPal(String s) */

public class exercico5 {
    public static void main(String[] args) {
        exercico5 obj = new exercico5();
        String palavra = "arara";
        System.out.println(obj.isPal(palavra)); // true
        System.out.println(obj.isPal("java")); // false
        System.out.println(obj.convBase2(3)); // 11
        System.out.println(obj.convBase2(2)); // 10
        System.out.println(obj.convBase2(4)); // 100
        System.out.println(obj.convBase2(0)); // 0
        System.out.println(obj.convBase2(1)); // 1
        System.out.println(obj.convBase2(5)); // 101
        System.out.println(obj.convBase2(8)); // 1000
    }

    public int fatorial(int n) {
        if (n <= 1)
            return 1;
        return n * fatorial(n - 1);
    }

    // Somatório de n até 0
    public int somatorio(int n) {
        if (n <= 0)
            return 0;
        return n + somatorio(n - 1);
    }

    // n-ésimo número da sequência de Fibonacci
    public int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Somatório dos inteiros entre k e j (inclusive)
    public int somaEntre(int k, int j) {
        if (k > j)
            return 0;
        return k + somaEntre(k + 1, j);
    }

    // é palíndrome
    public boolean isPal(String pal) {

        if (pal.length() <= 1) {
            return true;
        }

        if (pal.charAt(0) != pal.charAt(pal.length() - 1)) {
            return false;
        }

        return isPal(pal.substring(1, pal.length() - 1));
    }
    // Modele e implemente um método recursivo que recebe um inteiro zero ou
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
