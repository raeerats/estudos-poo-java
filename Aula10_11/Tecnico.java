package Aula10_11;

public final class Tecnico extends Aluno {  //final class : classe que não terá mais heranças a partir dela
                   //Especialidade de Aluno
    private String atividades;

    //AÇÕES
    public void fazerAtividade() {
        System.out.println("Aluno técnico " + this.nome + " está cumprindo atividades de " + getAtividades());
    }
    //SETTERS
    public void setAtividades(String atividades) {
        this.atividades = atividades;
    }
    @Override
    public void setCurso(String curso) {

        super.setCurso(curso);
    }
    //GETTERS
    public String getAtividades() {
        return atividades;
    }
    @Override
    public String getCurso() {
        return super.getCurso();
    }
    
}