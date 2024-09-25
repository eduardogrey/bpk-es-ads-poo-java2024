package ex_19;

public class Testebook {
    public static void main(String[] args) {
        LivroDigital book = new LivroDigital("sla","Ronaldo",2.8,true);
        book.abrirLivro();
        book.fechar();
    }
}
