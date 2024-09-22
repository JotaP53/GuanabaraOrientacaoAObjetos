package Aula04MetodosGetterSetterEConstructor;
public class Aula04 {
    public static void main(String[] args) {

//      Usando o método Construtor
        Caneta c1 = new Caneta(
                "BIC",
                "Azul",
                0.4f,
                true);
        c1.status();
        Caneta c2 = new Caneta(
                "Stabillo",
                "Preta",
                0.5f,
                false);
        c2.status();



//        Usando método setter
//        c1.setModelo("Bic");
//        c1.modelo = "Bic";
//        c1.setPonta(0.4f);
//        c1.ponta = 0.5f;
//        c1.status();
//        Usando metter getter
//        System.out.println("A minha caneta é " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
}
// Basicamente, os métodos Getter e Setter ajudam a "mexer" naquelas classes que estão privadas.
