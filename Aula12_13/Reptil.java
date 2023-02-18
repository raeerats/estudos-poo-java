package Aula12_13;

public class Reptil extends Animal{
    private String corEscama;

    //Métodos abstratos subescritos
    @Override
    public void locomover() {
        System.out.println("Rastejando.");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais.");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de réptil.");
    }


    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    public String getCorEscama() {
        return corEscama;
    }
}
