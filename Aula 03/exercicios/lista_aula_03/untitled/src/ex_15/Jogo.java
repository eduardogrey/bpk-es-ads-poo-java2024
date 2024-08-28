package ex_15;
/*
 Crie uma classe Jogo com atributos nome, genero, e preco.
 Adicione métodos para iniciar e pausar o jogo.

 */
public class Jogo {
    private  String nome;
    private  String genero;
    private Integer preco;



    public Jogo(String nome, String genero, Integer preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar(){
        System.out.println("o jogo esta iniciando!");
    }
   public  void  pausa(){
       System.out.println("o jogo esta pausado !");
   }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                '}';
    }
}
