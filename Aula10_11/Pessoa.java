package Aula10_11;

public abstract class Pessoa {
    //ATRIBUTOS
    protected String nome;
    protected int idade;
    protected String sexo;

    //MÉTODOS

    //Ações
    public final void fazerAniversario() { //METODO FINAL
        this.idade++;
    }

    //Setters
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Getters
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }

    public String toString() {
        return "_______Pessoa_______" + "\nNome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo;

    }

}
