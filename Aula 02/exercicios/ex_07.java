import java.util.Scanner;

public class ex_07 {

    public static int funcao(int num1,int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int num1 = scanner.nextInt();
        System.out.println(" Informe outro numero:");
        int num2 = scanner.nextInt();

        int resultado =  funcao(num1,num2);
        System.out.println(" o resultado deu : " + resultado);
    }
}
