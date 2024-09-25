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

    public void setQtapessoas(Integer qtapessoas) {
        if (qtapessoas < 0){
            System.out.println("sem pessoas na cozinha!");
        }else{
            this.qtapessoas = qtapessoas;
        }
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Cozinha{" +
                "qtapessoas=" + qtapessoas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
