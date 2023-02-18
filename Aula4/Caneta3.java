package Aula4;

public class Caneta3 {
    public String modelo;
    private double ponta;
    private String cor;
    private boolean caneta;

    public Caneta3 (String m, String c, double p) { //MÉTODO CONSTRUTOR
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }
    
    public void setModelo(String m) { // MÉTODO SETTER - adicionar modelo novo
        this.modelo = m;
    }
    public String getModelo() { // MÉTODO GETTER - pegar modelo já existente
        return this.modelo;
    }

    public void setPonta(double p) { // MÉTODO SETTER - adicionar modelo novo
        this.ponta = p;
    }
    public double getPonta() { // MÉTODO GETTER - pegar modelo já existente
        return this.ponta;
    }

    public void tampar() {
        this.caneta = true;
    }

    public void destampar() {
        this.caneta = false;
    }

    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor:" + this.cor);
        System.out.println("Tampada?: " + this.caneta);
    }
}
