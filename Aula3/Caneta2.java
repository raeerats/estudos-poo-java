package Aula3;

public class Caneta2 {
    public String modelo, cor;
    public double ponta;
    protected int carga;
    protected boolean canetaStatus;


    public void mostrarStatus() {
        System.out.println("Caneta - cor: " + this.cor);
        System.out.println("Está TAMPADA? " + this.canetaStatus);
    }

    public void rabiscar() {
        if (this.canetaStatus == true) {
            System.out.println("Erro. Impossível escrever pois a canetaStatus está TAMPADA.");
        } else {
            System.out.println("Estou RABISCANDO."); //this.canetaStatus == false;
        }
    }
    
    public void tampar() {
        this.canetaStatus = true;
    }
    
    public void destampar() {
        this.canetaStatus = false;
    }
}
