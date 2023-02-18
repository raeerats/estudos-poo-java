package Aula12_13;

public class Mamifero extends Animal {
    private String corPelo;

    //Métodos abstratos subescritos
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom() {
        System.out.println("som de Mamífero");
    }


    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

}
