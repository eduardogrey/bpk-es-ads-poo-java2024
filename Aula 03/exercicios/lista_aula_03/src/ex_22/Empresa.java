package ex_22;

import java.util.Scanner;

/*
Defina uma classe Empresa com atributos como nome, CNPJ, e numeroFuncionarios.
Adicione métodos para contratar e demitir funcionários.
 */
public class Empresa {
    private String nome;
    private Integer cnpj;
    private Integer numfuncionarios;

    public Empresa(String nome, Integer cnpj, Integer numfuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numfuncionarios = numfuncionarios;
    }

    public  void contratar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- contratar");
        System.out.println("2 - demitir");
        int op = scanner.nextInt();
        switch(op){
            case 1:
                System.out.println("informe quantas pessoas deseja contratar:");
                int contrata = scanner.nextInt();
                numfuncionarios += contrata;
                System.out.println(numfuncionarios);
            break;
            case  2:
                System.out.println("informe quantas pessoas deseja demitir:");
                int demitir = scanner.nextInt();
                numfuncionarios -= demitir;
                System.out.println(numfuncionarios);
                break;
            default:
                System.out.println("invalido!!!");
                break;
        }
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public Integer getNumfuncionarios() {
        return numfuncionarios;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", cnpj=" + cnpj +
                ", numfuncionarios=" + numfuncionarios +
                '}';
    }
}
