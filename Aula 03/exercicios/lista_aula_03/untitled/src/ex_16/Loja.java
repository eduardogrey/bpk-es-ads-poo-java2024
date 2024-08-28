package ex_16;
/*
Crie uma classe Loja com atributos nome, endereco, e telefone.
 Adicione métodos para abrir e fechar a loja.

 */
public class Loja {
    private  String nome;
    private  String endereco;
    private  String telefone;
   private  Boolean loja;

    public Loja(String nome, String endereco, String telefone, Boolean loja) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.loja = loja = false;
    }

    public void lojaAberta(){
        if (loja){
            System.out.println("A loja esta aberta!");
        }else{
            loja = true;
            System.out.println("A loja foi aberta!");
        }
    }
    public void fechar(){
        if (!loja){
            System.out.println("a loja esta fechada!");
        }else {
            loja = false;
            System.out.println("a loja foi fechada");
        }
    }



    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                ", loja=" + loja +
                '}';
    }
}
