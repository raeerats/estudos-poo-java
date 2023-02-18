package Aula10_11;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Bolsista p5 = new Bolsista();
        Tecnico p6 = new Tecnico();


        p2.setNome("Renata");//Aluno
        p3.setNome("Oswaldo");//Professor
        p4.setNome("Neide");//Funcionario
        p5.setNome("Fabio");//Boslsista
        p6.setNome("Bruno");//Técnico


        p2.pagarMensalidade(); //Pagar mensalidade original
        p5.setBolsa(50);
        p5.pagarMensalidade(); //Com o método @Override
        p6.setCurso("Técnico em Informática");
        p6.setAtividades("programação");
        p6.fazerAtividade();
    }
}
