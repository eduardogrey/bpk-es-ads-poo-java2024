import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Informe seu nome ");
        String nome = scanner.next();

        System.out.println("Informe sua idade ");
        int idade = scanner.nextInt();

        System.out.println( "Seu nome eh " + nome + " e sua idade eh " + idade);
    }
}
