package ex_20;
/*
Crie uma classe Bicicleta com atributos marca, modelo, e tamanhoRoda.
 Adicione métodos para pedalar e frear.
 */
public class Bicicleta {
    private  String marca;
    private  String modelo;
    private  Integer tamanhoroda;

    public Bicicleta(String marca, String modelo, Integer tamanhoroda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoroda = tamanhoroda;
    }

    public void pedalar(){
        System.out.println("esta pedalando!");
    }
    public void frear(){
        System.out.println("a bike esta freando!");
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanhoroda=" + tamanhoroda +
                '}';
    }
}
