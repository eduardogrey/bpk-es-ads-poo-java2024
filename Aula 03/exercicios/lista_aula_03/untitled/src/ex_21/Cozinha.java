package ex_21;
/*
Implemente uma classe Cozinha com atributos tipo, quantidadePessoas, e cor.
 Adicione métodos para cozinhar e limpar.

 */
public class Cozinha {
    private Integer qtapessoas;
    private  String cor;

    public Cozinha(Integer qtapessoas, String cor) {
        this.qtapessoas = qtapessoas;
        this.cor = cor;
    }

    public  void cozinhar(){
        System.out.println("as pessoas estao cozinhando!");
    }
    public  void limpar(){
        System.out.println("as pessoas estao limpando a cozinha!");
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "qtapessoas=" + qtapessoas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
