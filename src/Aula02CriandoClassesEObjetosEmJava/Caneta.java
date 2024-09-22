package Aula02CriandoClassesEObjetosEmJava;

public class Caneta {

    // Declaração de Atributos
    String modelo;
    String cor;
    String marca;
    float ponta;
    int carga;
    boolean tampada;

    void status () {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar() {
        if (tampada) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    void tampar () {
        this.tampada = true;
    }

    void destampar () {
        this.tampada = false;
    }

}
