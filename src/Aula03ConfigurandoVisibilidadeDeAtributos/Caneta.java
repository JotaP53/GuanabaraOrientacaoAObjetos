package Aula03ConfigurandoVisibilidadeDeAtributos;

public class Caneta {

    // Declaração de Atributos
    public String modelo;
    public String cor;
    private String marca;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void rabiscar() {
        if (tampada) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    protected void tampar () {
        this.tampada = true;
    }

    protected void destampar () {
        this.tampada = false;
    }
}
