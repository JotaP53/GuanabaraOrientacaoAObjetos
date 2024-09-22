package Aula02CriandoClassesEObjetosEmJava;

public class Aula02 {
    public static void main (String[] args) {

        // Instanciando um objeto caneta
        Caneta c1 = new Caneta();

        // Chamando Atributos
        c1.modelo = "Hidrográfica";
        c1.cor = "Azul";
        c1.marca = "Oval";
        c1.ponta = 0.4f;
        c1.carga = 100;
        c1.tampada = true;

        // Instanciando um novo objeto
        Caneta c2 = new Caneta();

        // Chamando Atributos
        c2.modelo = "Hidrográfica";
        c2.cor = "Vermelha";
        c2.marca = "Oval";
        c2.ponta = 0.4f;
        c2.carga = 100;
        c2.tampada = false;

        // Chamando métodos
        c1.status();
        c1.rabiscar();
        c2.status();
        c2.rabiscar();
    }
}
