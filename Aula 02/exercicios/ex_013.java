import java.util.Random;
import java.util.Scanner;

public class ex_013 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);;

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Adivinhe o número (entre 1 e 100):");

        while (true) {
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroSecreto) {
                System.out.println("Acertou em " + tentativas + " tentativas");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo");
            } else {
                System.out.println("Muito alto");
            }
        }
    }
}
