import java.util.Scanner;

public class ex_15 {

    public static int fatorial(int num) {
        if(num == 1){
            return 1;
        }else{
            return (num *  fatorial(num - 1 ));
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero :");
        int num = scanner.nextInt();

        System.out.println(num + " ! " +  " = " +  fatorial(num));
    }
}
