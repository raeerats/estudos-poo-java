package Aula5;

public class Banco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(11111);
        p1.setNomeCliente("Rae Enterteinment");
        p1.abrirConta("CC");
        p1.estadoAtual();
        System.out.println();
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(22222);
        p2.setNomeCliente("RaeRae");
        p2.abrirConta("P");
        p2.estadoAtual();


        //DEPOSITOS E SAQUES
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(1000);
        p1.estadoAtual();
        p2.estadoAtual();


    }
}
