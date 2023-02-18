package Aula14_ProjetoFinal;

public abstract class Pessoa {
    protected String nome;
    protected int idade, experiencia;
    protected String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public void ganharEXP() {
        //ganhar EXP a cada nova experiencia
    }

//----------------------------------------------------------------------------------------------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getSexo() {
        return sexo;
    }
    public int getExperiencia() {
        return experiencia;
    }
}
