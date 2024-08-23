import java.util.Scanner;

public class ex_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado;

        System.out.println("1 - Fahrenheit para celsius");
        System.out.println(" 2- Celsius para Fahrenheit");
        int op = scanner.nextInt();

        switch (op){
            case 1:
                System.out.println("digite a temperatura a ser convertida :");
                int fahrenheit = scanner.nextInt();
                resultado = (fahrenheit - 32) * 5/9;
                System.out.println(resultado);

                break;
            case 2:
                System.out.println("digite a temperatura a ser convertida:");
                int celsius = scanner.nextInt();
                resultado = (celsius * 1.8) + 32;
                System.out.println(resultado);

        }

    }
}
