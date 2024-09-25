package ex_09;

import java.util.Scanner;

/*
Defina uma classe Produto com atributos como nome, preco, e quantidadeEstoque.
 Adicione métodos para aumentar e diminuir o estoque.

 */
public class Produto {
    private String nome;
    private  Integer preco;
    private  Integer qtdEstoque;

    public Produto(String nome, Integer preco, Integer qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtdEstoque=" + qtdEstoque +
                '}';
    }

    public  void ex(){
        Scanner scanner = new Scanner(System.in);
         char dnv;
        do {


            System.out.println("1 -  quantidade para retirar do estoque ");
            System.out.println("2 - quantidade para incrementar no estoque");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("informe a quantidade que deseja retirar:");
                    int retirada = scanner.nextInt();
                    if (retirada > qtdEstoque) {
                        System.out.println("a quantidade desejada ultrapassa o estoque ");
                    } else {
                        retirada = qtdEstoque - retirada;
                        System.out.println("quantidade de produtos no estoque: " + retirada);
                    }
                    break;
                case 2:
                    System.out.println("informe a quantidade que deseja adicionar no estoque:");
                    int ad = scanner.nextInt();
                    qtdEstoque = qtdEstoque + ad;
                    System.out.println("quantidade de produtos no estoque: " + qtdEstoque);
                    break;
                default:
                    System.out.println("opcao invalida!!");
            }
            System.out.println("deseja fazer mais uma operacao ? (S/N):");
             dnv = scanner.next().charAt(0);
        }while (dnv == 's' || dnv =='S');


    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public Integer getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("nao tem nome");
        }
    }
}
