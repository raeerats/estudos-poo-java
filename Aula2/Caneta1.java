package Aula2;

public class Caneta1 {
    String modelo, cor;
    double ponta;
    int carga;
    boolean caneta;

    void mostrarStatus() {
        System.out.println("Caneta cor: " + this.cor);
        System.out.println("Caneta está TAMPADA? " + this.caneta);
    }

    void rabiscar() {
        if (this.caneta == true) {
            System.out.println("Erro. Impossível escrever pois a caneta está TAMPADA.");
        } else {
            System.out.println("Estou RABISCANDO."); //this caneta == false;
        }
    }
    
    
    void tampar() {
        this.caneta = true;
    }
    
    void destampar() {
        this.caneta = false;
    }
}