package ex_07;

import java.util.Scanner;

/*
Implemente uma classe Aluno com atributos nome, matricula, e curso.
 Adicione um método para calcular a média de notas.
 */
public class Aluno {
    private  String nome;
    private  Integer matricula;
    private  String curso;

    public Aluno(String nome, Integer matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public  void media(){
        int i;
        int soma = 0;
        Scanner ler = new Scanner(System.in);
        for (i=0;i<3;i++){
            System.out.println("Informe a nota do aluno" + (i+1) + " :" );
            int nota = ler.nextInt();
             soma += nota;
        }
        int media = soma / 3;
        System.out.println(" a média do aluno " + nome + " : " + media);
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String getNome() {
        return nome;
    }
}
