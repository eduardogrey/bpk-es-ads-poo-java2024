package ex_04;

import java.util.Scanner;

/*
Crie uma classe ContaBancaria com atributos como numeroConta e saldo.
 Adicione métodos para depositar e sacar dinheiro.
 */
public class Contabancaria {
 private Integer numConta;
 private  Integer saldo;

    public Contabancaria(Integer numConta, Integer saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- saque ");
        System.out.println("2- deposito ");
        int op = scanner.nextInt();

        switch (op){
            case 1:
                System.out.println("Informe a quantia desejada de saque: ");
                int saque = scanner.nextInt();
                if (saldo < saque){
                    System.out.println("quantia desejada ultrapassa o saldo da conta");
                }else{
                   int testesaque = saldo - saque;
                    System.out.println("Saldo na conta : " + testesaque);
                }
                break;
            case 2:
                System.out.println("Informe o valor do deposito: ");
                int deposito = scanner.nextInt();
                int testedepo = saldo + deposito;
                System.out.println("Saldo na conta : " + testedepo);
        }
    }

    public Integer getSaldo() {
        return saldo;
    }

    public Integer getNumConta() {
        return numConta;
    }


    @Override
    public String toString() {
        return "Contabancaria{" +
                "numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
