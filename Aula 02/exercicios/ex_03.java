import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Informe um numero :");
        int num1 = scanner.nextInt();
        System.out.println(" Informe outro numero:");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multi = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("soma dos numeros : " + soma);
        System.out.println(" a subtracao dos numeros : " + subtracao);
        System.out.println("a multiplicacao dos numeros : " + multi);
        System.out.println("a divisao dos numeros : " + divisao);
    }
}
