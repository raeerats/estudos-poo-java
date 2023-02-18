package Aula14_ProjetoFinal;

public class AssistindoVideo {
    public static void main(String[] args) {

        Video[] v = new Video[2];
        v[0] = new Video("POO JAVA - COMPLETO");

        Seguidor [] s = new Seguidor[3];
        s[0] = new Seguidor("Raquel", 19, "feminino", "raefontes");

        Visualizacao viw = new Visualizacao(s[0], v[0]);
        System.out.println(viw.toString());

        viw.avaliarVar(9);
        System.out.println(viw.toString());

    }
}