package Aula10_11;

public class Professor extends Pessoa { //herança criada
    private String especialidade;
    private double salario;

    //AÇÕES
    public void receberAumento(double aum) {
        this.salario += aum;
    }

    //Setters
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Getters
    public String getEspecialidade() {
        return especialidade;
    }
    public double getSalario() {
        return salario;
    }
}