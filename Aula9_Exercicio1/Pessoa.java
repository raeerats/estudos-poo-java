package Aula9_Exercicio1;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Construtor
    public Pessoa(String n, int i, String s) {
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }

    //Setters
    public void setNome(String n) {
        this.nome = n;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public void setSexo(String s) {
        this.sexo = s;
    }

    //Getters
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getSexo() {
        return this.sexo;
    }
}