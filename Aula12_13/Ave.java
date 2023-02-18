package Aula12_13;

public class Ave extends Animal {
    private String corPena;

    
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutos");
    }
    @Override
    public void emitirSom() {
        System.out.println("Cantando");
    }
    public void fazerNinho() {
        System.out.println("Ninho construído");
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    public String getCorPena() {
        return corPena;
    }
}
