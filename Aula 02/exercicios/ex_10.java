import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ver ser eh primo ou nao");
        int num = scanner.nextInt();
        int i;
        boolean primo = true;
        if(num  <= 1){
            primo = false;
        }else{
            for(i = 2; i < num; i++){
                if( num %  i == 0){
                    primo = false;
                    break;
                }

            }
        }
        if (primo){
            System.out.println( " eh um numero primo ");
        }else {
            System.out.println( " nao eh um numero primo");
        }
    }
}
