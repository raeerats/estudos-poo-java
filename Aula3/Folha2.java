package Aula3;

public class Folha2 {
    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.mostrarStatus();
        c1.rabiscar();
        c1.tampar();
        c1.mostrarStatus();
        c1.rabiscar();
    }
}
