package Aula7_8;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado; //Tipo do atributo é a propria classe Lutador, isto é 
    private Lutador desafiante; //os lutadores se tornaram variáveis Abstratas
    private boolean aprovada;

    //Métodos principais
    public void marcarLuta(Lutador l1, Lutador l2) { //É possivel utilizar a classe como parametro
                                                    //Lutador -> ∃xLx {x => (desafiante ∨ desafiado)}
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)) { //Também é possivel utilizar métodos de outra classe
            this.aprovada = true; 
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
        if (aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            switch (vencedor) {
                case 0: //Empate
                System.out.println("Empatou");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;
                case 1: //Desafiado vence
                System.out.println("Vitória do " + this.desafiado.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
                case 2: //Desafiante vence
                System.out.println("Vitória do " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            }
        }
    }

    //Métodos especiais
    public void setDesafiado(Lutador dd) { 
        this.desafiado = dd;                   
    }
    public Lutador getDesafiado() { //Retornando um tipo de dado Classe
        return this.desafiado;           // Lutador -> desafiado {return 'Lx' == desafiado}
    }

    public void setDesafiante(Lutador dd) {
        this.desafiante = dd;
    }
    public Lutador getDesafiante() {
        return this.desafiante;
    }
}
