package Aula2;

public class Folha1 {
    public static void main(String[] args) {
        Caneta1 c1 = new Caneta1(); //CANETA AZUL - TAMPADA
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.tampar();
        c1.rabiscar();
        c1.mostrarStatus();
        
        System.out.println();

        Caneta1 c2 = new Caneta1(); //CANETA PRETA - DESTAMPADA
        c2.cor = "Preta";
        c2.ponta = 0.5;
        c2.destampar();
        c2.rabiscar();
        c2.mostrarStatus();
    }
}