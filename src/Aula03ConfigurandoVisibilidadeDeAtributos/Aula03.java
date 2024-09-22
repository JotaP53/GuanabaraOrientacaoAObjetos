package Aula03ConfigurandoVisibilidadeDeAtributos;

public class Aula03 {
    public static void main (String[] args) {
        // Instanciando um objeto caneta
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; // ele ficou vermelho porque a visibilidade foi colocada como privada.
        c1.carga = 80;
        // c1.tampada = true; // No caso da carga e tampada, conseguimos tranquilamente chamá-las, porque são protegidas e não privadas.
        c1.status();
        c1.tampar();
        c1.rabiscar();
    }
}
