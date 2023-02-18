package Aula12_13;

public class Peixe extends Animal {
    private String corEscama;
    
    //Métodos abstratos sub-escritos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo algas ou animais marinhos");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    public void soltarBolha() {
        System.out.println("Glub Blup Oo¨");
    }


    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    public String getCorEscama() {
        return corEscama;
    }
}
