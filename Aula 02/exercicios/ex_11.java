import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma palavra: ");
        String palavra = scanner.next();

        String inversa = new StringBuilder(palavra).reverse().toString();

        if (palavra.equalsIgnoreCase(inversa)){
            System.out.println(palavra + " eh um polindromo");
        }else {
            System.out.println(palavra + " nao eh um polindromo");
        }
    }
}
