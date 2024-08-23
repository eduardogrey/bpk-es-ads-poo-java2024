import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe um numero : ");
        int num1 = scanner.nextInt();

        System.out.println("informe outro numero:");
        int num2 = scanner.nextInt();

        System.out.println("1 - soma");
        System.out.println("2 - divisao");
        System.out.println("3 - subtracao");
        System.out.println("4 - multiplicacao");
        int op = scanner.nextInt();
       int resultado = 0;
        switch (op){
            case 1:
                resultado = num1 + num2;

                break;
            case 2:
                if( num2 != 0) {
                    resultado = num1 / num2;
                }else {
                    System.out.println("divisao invalida");
                }
                break;
            case  3:
                resultado = num1 - num2;
               break;
            case 4:
                resultado = num1 * num2;
                break;

            default:
                System.out.println("opcao invalida");
                break;


        }
        System.out.println(" : " + resultado);
    }
}
