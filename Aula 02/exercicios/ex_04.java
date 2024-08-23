import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe um numero inteiro para saber se eh par ou impar:");
        int num = scanner.nextInt();
        if (num % 2 != 0) {
            System.out.println("" + num + " eh um numero  impar");
        } else {
            System.out.println("" + num + " eh um numero par");
        }

    }

}
