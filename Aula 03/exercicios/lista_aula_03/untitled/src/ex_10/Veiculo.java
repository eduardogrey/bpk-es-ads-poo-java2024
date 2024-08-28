package ex_10;
/*
Crie uma classe Veiculo com atributos tipo, placa, e cor.
 Adicione métodos para abastecer e lavar o veículo.
 */
public class Veiculo {
    private  String tipo;
    private  String cor;
    private  String placa;

    public Veiculo(String tipo, String cor, String placa) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
    }

    public  void lavar(){
        System.out.println("o carro esta sendo lavado!");
    }
    public  void  abastecer(){
        System.out.println("o carro esta abastecendo no posto Ipiranga!");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                ", placa=" + placa +
                '}';
    }
}
