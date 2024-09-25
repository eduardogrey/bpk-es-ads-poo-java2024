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

    public Integer getTamanhoroda() {
        return tamanhoroda;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()){
            this.marca = marca;
        }else {
            System.out.println("esta sem a marca");
        }

    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isEmpty()){
            this.modelo = modelo;
        }else {
            System.out.println("sem modelo");
        }
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
