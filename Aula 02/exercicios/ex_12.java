import java.util.Arrays;
import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []  num = new int[5];
   int i ;
        for(i = 0; i < 5; i++){
            System.out.println("digite 5 numero");
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num);

        System.out.println(" ordem cresente");
        System.out.println(Arrays.toString(num));
    }
}
