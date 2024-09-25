package ex_03;
/*
Implemente uma classe Pessoa com atributos nome, idade, e altura. Adicione um método que
 imprime uma apresentação da pessoa.
 */
public class Pessoa {
    private  String nome;
    private  Integer idade;
    private  double altura;

    public Pessoa(String nome, Integer idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
