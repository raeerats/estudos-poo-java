package Aula6;

public class LigandoTV {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        c.fecharMenu();
        c.maisVolume();
        c.desligarMudo();
    }
}