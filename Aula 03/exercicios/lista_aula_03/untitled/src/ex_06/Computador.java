package ex_06;

import java.security.PrivateKey;

/*
Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento.
 Adicione métodos para ligar e desligar o computador.
 */
public class Computador {
    private   String cpu;
    private  Integer Ram;
    private  Integer ssd;
    private  Boolean ligado = false;


    public Computador(String cpu, Integer ram, Integer ssd) {
        this.cpu = cpu;
        this.Ram = ram;
        this.ssd = ssd;
    }
    public void ligar(){
        ligado = true;
        System.out.println("o computador está ligado");
    }
    public void desligar(){
        ligado = false;
        System.out.println("o computador está desligado");
    }

    @Override
    public String toString() {
        return "Computador{" +
                "cpu='" + cpu + '\'' +
                ", Ram=" + Ram +
                ", ssd=" + ssd +
                ", ligado=" + ligado +
                '}';
    }
}
