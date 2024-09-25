package ex_11;

import java.util.Scanner;

/*
Crie uma classe Cidade com atributos nome, populacao, e estado.
 Adicione métodos para aumentar e diminuir a população.
 */
public class Cidade {
    private String nome;
    private Integer populacao;
    private String estado;

    public Cidade(String nome, Integer populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", estado='" + estado + '\'' +
                '}';
    }

    public void popu() {

        Scanner scanner = new Scanner(System.in);
        char dnv;
        do {
            System.out.println("1- aumentar a populacao");
            System.out.println("2- diminuir a populacao");
            int op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("informe a a quantidade que deseja aumentar:");
                    int aum = scanner.nextInt();
                    populacao += aum;
                    System.out.println("a populacao atual da cidade: " + nome + " eh : " + populacao);
                    break;
                case 2:
                    System.out.println("informe a quantos deseja remover da cidade:");
                    int remove = scanner.nextInt();
                    populacao -= remove;
                    System.out.println("a populacao atual da cidade: " + nome + " eh : " + populacao);
                    break;

                default:
                    System.out.println("invalido!!");
                    break;
            }
            System.out.println("deseja realizar novamente ? (S/N):");
            dnv = scanner.next().charAt(0);
        } while (dnv == 's' || dnv == 'S');
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("nao tem nome");
        }
    }

    public void setPopulacao(Integer populacao) {
        if (populacao < 0 ){
            System.out.println("cidade vazia...");
        }else{
            this.populacao = populacao;
        }
    }
}