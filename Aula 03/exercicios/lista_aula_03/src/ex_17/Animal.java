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

    public String getEspecie() {
        return especie;
    }

    public void setIdade(Integer idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("sem idade");
        }
    }
    public void setPeso(Integer peso) {
        if (peso < 0){
            System.out.println("esta sem peso");
        }else {
            this.peso = peso;
        }
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
