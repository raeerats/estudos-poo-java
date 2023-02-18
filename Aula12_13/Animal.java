package Aula12_13;

public abstract class Animal {
    protected String especie;
    protected double peso;
    protected int idade;
    protected int qtdeMembros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String getEspecie() {
        return especie;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public int getQtdeMembros() {
        return qtdeMembros;
    }

}
