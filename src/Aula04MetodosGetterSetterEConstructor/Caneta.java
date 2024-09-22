package Aula04MetodosGetterSetterEConstructor;
public class Caneta {

    // Definindo Atributos
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;


// Teste de criação no automático

    public Caneta(String modelo, String cor, float ponta, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: " + this.getTampada());
    }

    // Tudo a partir daqui foi criado manualmente
//    // Fazendo o método construtor
//    // Método construtor não leva void
//    public Caneta(
//            String m,
//            String c,
//            float p,
//            boolean t)
//    {
//        this.setModelo(m);
//        this.setPonta(p);
//        this.setCor(c);
//        this.setTampada(t);
//    }
//
//    // Definindo Métodos Acessores e Modificadores
//    public String getModelo () {
//        return this.modelo;
//    }
//    public void setModelo (String m) {
//        this.modelo = m;
//    }
//    public float getPonta () {
//        return this.ponta;
//    }
//    public void setPonta (float p) {
//        this.ponta = p;
//    }
//    public String getCor () {
//        return this.cor;
//    }
//    public void setCor (String c) {
//        this.cor = c;
//    }
//    public boolean getTampar () {
//        return this.tampada;
//    }
//    public void setTampada (boolean t) {
//        this.tampada = true;
//    }
//
//    public void status() {
//        System.out.println("Sobre a Caneta: ");
//        System.out.println("Modelo: " + this.getModelo());
//        System.out.println("Ponta: " + this.getPonta());
//        System.out.println("Cor: " + this.getCor());
//        System.out.println("Tampada: " + this.getTampar());
//    }
}
