package ex_15;

public class Testejogo {
    public static void main(String[] args) {
        Jogo game = new Jogo("the last of us","acao",250);

        game.iniciar();
        game.pausa();
    }
}
