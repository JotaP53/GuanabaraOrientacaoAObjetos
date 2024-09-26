package Aula05ExemploPráticoEmJava;

public class ContaBanco {

    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // métodos personalizados
    public void estadoAtual() {
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equalsIgnoreCase("CC")) {
            this.setSaldo(50);
        } else if (tipo.equalsIgnoreCase("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta");
    }
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Impossível fechar. Dinheiro na conta.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Impossível fechar. Salo devedor na conta.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }
    }
    public void depositar(float saldo) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + saldo);
            System.out.println("Déposito realizado na conta de " + getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }
    public void sacar(float saldo) {
        if (this.getStatus()) {
            if (this.getSaldo() >= saldo) {
                this.setSaldo(this.getSaldo() - saldo);
                System.out.println("Saque realizado na conta de " + getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }
    public void pagarMensal() {
        int saldo = 0;
        if (this.getTipo().equalsIgnoreCase("CC")) {
            saldo = 12;
        } else if (this.getTipo().equalsIgnoreCase("CP")) {
            saldo = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - saldo);
            System.out.println("Mensalidade paga com sucesso");
        } else {
            System.out.println("Impossível pagar conta.");
        }
    }

    // métodos especiais
    public ContaBanco() { // método construtor
        this.setSaldo(0); // está assim pq foi criado o método modificador setter;
        this.setStatus(false); // está assim pq foi criado o método modificador setter;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
