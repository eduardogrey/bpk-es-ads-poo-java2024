package ex_19;
/*
Defina uma classe LivroDigital com atributos como titulo, autor, e tamanhoArquivo.
 Adicione métodos para abrir e fechar o livro.

 */
public class LivroDigital {
    private  String titulo;
    private  String autor;
    private  double tamanho;
    private  Boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanho, Boolean aberto) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanho = tamanho;
        this.aberto = aberto = false;
    }

    public void abrirLivro(){
        if (aberto){
            System.out.println("o livro esta aberto");
        }else {
            aberto = true;
            System.out.println("o livro foi aberto");
        }
    }
    public  void  fechar(){
        if (!aberto) {
            System.out.println("o livro  foi fechado");
        }else{
            aberto = false;
            System.out.println("o livro esta fechado");
        }
    }


    @Override
    public String toString() {
        return "LivroDigital{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tamanho=" + tamanho + "mb" +
                ", aberto=" + aberto +
                '}';
    }
}
