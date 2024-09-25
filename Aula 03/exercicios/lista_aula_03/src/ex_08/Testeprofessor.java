package ex_08;

public class Testeprofessor {
    public static void main(String[] args) {
        Professor prof  = new Professor("eduardo","ADS",0);

        prof.aula();
        prof.prova();
       prof.setNome("");
       prof.setSalario(0);
    }
}
