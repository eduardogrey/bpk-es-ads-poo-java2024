package ex_08;
/*
Crie uma classe Professor com atributos nome, disciplina, e salario.
 Adicione métodos para dar aula e corrigir provas.
 */
public class Professor {
    private  String nome;
    private  String disciplina;
    private  Integer salario;
    private  Boolean aula = false;

    public Professor(String nome, String disciplina, Integer salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public  void aula(){
        aula = true;
        System.out.println(nome + " esta dando aula");
    }
    public  void  prova(){
        System.out.println(nome + " esta corrigindo as provas  da " + disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Boolean getAula() {
        return aula;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("nao tem nome");
        }
    }

    public void setSalario(Integer salario) {
        if (salario < 0){
            this.salario = salario;
        }else{
            System.out.println("saldo negativo, seu nome sera encaminhado ao serasa! ");
        }

    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplina='" + disciplina + '\'' +
                ", salario=" + salario +
                ", aula=" + aula +
                '}';
    }
}
