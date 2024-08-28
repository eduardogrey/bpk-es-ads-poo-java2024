package ex_14;

import java.util.Scanner;

/*
Defina uma classe Time com atributos como nome, tecnico, e numeroDeJogadores.
Adicione métodos para adicionar e remover jogadores.

 */
public class Time {
    private  String nome;
    private  String tecnico;
    private  Integer numjogadores;

    public Time(String nome, String tecnico, Integer numjogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numjogadores = numjogadores;
    }

    public  void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- adicionar jogador");
        System.out.println("2 - remover jogador");
        int op = scanner.nextInt();

        switch (op){
            case 1:
                System.out.println("informe quantos jogadores deseja adicionar:");
                int adjogador = scanner.nextInt();
                numjogadores += adjogador;
                System.out.println("o time " + nome + " esta com atualmete " + numjogadores +  " de jogadores!");
                break;
            case  2:
                System.out.println("informe quantos jogadores deseja remover:");
                int remove = scanner.nextInt();
                numjogadores -= remove;
                System.out.println("o time " + nome + " esta com atualmete " + numjogadores +  " de jogadores!");
                break;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", numjogadores=" + numjogadores +
                '}';
    }
}
