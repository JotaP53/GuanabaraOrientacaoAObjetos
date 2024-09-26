package Aula05ExemploPráticoEmJava;

public class Aula05 {
    public static void main (String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(260924);
        p1.setDono("João Pedro Martins");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(271025);
        p2.setDono("Gustavo Irineu");
        p2.abrirConta("CP");

        p1.depositar(250);
        p2.depositar(150);

        p2.sacar(100);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
