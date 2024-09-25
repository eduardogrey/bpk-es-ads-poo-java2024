package ex_05;
/*
Defina uma classe Cachorro com atributos nome, raca, e idade.
 Adicione métodos para latir e correr.
 */

public class Cachorro {
    private String nome;
    private  String raca;
    private  Integer idade;

    public Cachorro(String nome, String raca, Integer idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    public  void latir(){
        System.out.println(" o " + nome + " esta latindo");
    }
    public void  correr(){
        System.out.println(" o "  +  nome + " esta correndo!");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setIdade(Integer idade) {
        if (idade > 0 && idade != null) {
            this.idade = idade;
        } else {
            System.out.println("idade invalida!!");
        }
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                '}';
    }
}
