package Aula6;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos Especiais
    //CONSTRUTOR
    public ControleRemoto() { //Valores padrão para iniciar
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //SOBRESCREVENDO METODOS ABSTRATOS - ACÕES DA CLASSE
    //Classe implementando todas as ações que ocorerão na interface, para assim ENCAPSULAR suas funções e mantê-las seguras
    public void ligar() {
        this.setLigado(true);
    }
    public void desligar() {
        this.setLigado(false);
    }
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("[]");
        }
    }
    public void fecharMenu() {
        System.out.println("\nFechando menu...");
    }
    public void maisVolume() {
        if (this.getLigado()) { //se estiver ligado
            this.setVolume(this.getVolume() + 5); //aumentando volume
        } else {
            System.out.println("Impossivel aumentar volume");
        }
    }
    public void menosVolume() {
        if (this.getLigado()) { //se estiver ligado
            this.setVolume(this.getVolume() - 5); //diminuindo volume
        } else {
            System.out.println("Impossivel diminuir volume");
        }
    }
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) { //se estiver ligada e volume acima de 0
            this.setVolume(0); //colocando no mudo insetindo o valor de 0 ao setVolume
        }
    }
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0) { // se estiver ligada e já no mudo (volume 0)
            this.setVolume(50); //volume médio
        }
    }
    public void play() {
        if (this.getLigado() && !this.getTocando()) { //se estiver ligado e Não estiver tocando
            this.setTocando(true); //dá play
        } else {
        System.out.println("Impossivel dar play");
        }
    }
    public void pause() {
        if (this.getLigado() && this.getTocando()) { //se estiver ligado e tocando
            this.setTocando(false);
        } else { 
            System.out.println("Impossivel dar pause");
        }
    }
//--------------------------------------------------------------------------------------------------------------------------------------
    //GETTERS  - apenas devolver e retornar o valor das variáveis 
    //Possuem retorno, porém não utilizam parâmetro;
    private int getVolume() {
        return this.volume;
    }
    private boolean getLigado() {
        return this.ligado;
    }
    private boolean getTocando() {
        return this.tocando;
    }

    //SETTERS - inserir ou alterar o valor nas variáveis
    //Não possuem retorno, porém pedem o parametro
    private void setVolume(int v) {
        this.volume = v;
    }
    private void setLigado(boolean l) {
        this.ligado = l;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }

    //GETTER sempre será um método para visualizar os valores inseridos pelo SETTER, portanto
    //o setter pede o parametro (valor a ser inserido na variável privada), daí usa-se o getter para visualizar
    //e mostrar a saída do valor inserido anteriormente por meio do setter.

}
