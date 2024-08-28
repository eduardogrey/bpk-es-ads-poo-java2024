package ex_12;
/*
Implemente uma classe Filme com atributos titulo, diretor, e duracao.
 Adicione métodos para iniciar e parar o filme.
 */
public class Filme {
    private  String titulo;
    private  String diretor;
    private  Integer duracao;
  public   Boolean rodando = false;

    public Filme(String titulo, String diretor, Integer duracao, Boolean rodando) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.rodando = rodando;
    }

    public  void iniciar(){
        rodando = true;
        System.out.println("o filme esta rodando!");
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                ", rodando=" + rodando +
                '}';
    }
}
