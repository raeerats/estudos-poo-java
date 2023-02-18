package Aula10_11;

public class Aluno extends Pessoa { //herança criada
    private int matricula;
    private String curso;

    //AÇÕES
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.nome); //nome está como protegido, portanto, pode ser utilizado em métodos
    }
    public void cancelarMatricula() {
        System.out.println("Sua matricula será cancelada");
    }
    //Setters
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    //Getters
    public String getCurso() {
        return curso;
    }
    public int getMatricula() {
        return matricula;
    }
}
