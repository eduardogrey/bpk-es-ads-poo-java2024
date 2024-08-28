package ex_17;
/*
Implemente uma classe Animal com atributos especie, idade, e peso.
 Adicione métodos para alimentar e dormir.

 */
public class Animal {
    private  String especie;
    private  Integer idade;
    private  Integer peso;

    public Animal(String especie, Integer idade, Integer peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public  void alimentar(){
        System.out.println(especie  + " esta se alimentando!");
    }
    public  void  dormir(){
        System.out.println(especie + " esta dormindo!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}
