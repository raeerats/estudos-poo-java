package Aula10_11;

public final class Bolsista extends Aluno {  //final class : classe que não terá mais heranças a partir dela
                            //Especialidade de Aluno
    private int bolsa;

    //AÇÕES
    public void renovarBolsa() {
        System.out.println("Renovando bolsa do aluno " + this.nome);
    }
    @Override //Permite que subescrevemos um método já existente em Aluno
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista. Pagamento facilitado");
    }

    //Setters
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    @Override
    public void setCurso(String curso) {
        super.setCurso(curso);
    }

    //Getters
    public int getBolsa() {
        return bolsa;
    }
    @Override
    public String getCurso() {
        return super.getCurso();
    }
}
