package Aula14_ProjetoFinal;

public class Visualizacao{
    private Seguidor espectador;
    private Video video;

    public Visualizacao(Seguidor espectador, Video video) {
        super();
        this.espectador = espectador;
        this.video = video;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.video.setViews(this.video.getViews()+1);
    }

    public void avaliarMaxima() {
        this.video.setAvaliacao(5);
    }
    public void avaliarVar(int nota) {
        this.video.setAvaliacao(nota);
    }

//----------------------------------------------------------------------------------------------------------------------------------------

    public void setEspectador(Seguidor espectador) {
        this.espectador = espectador;
    }
    public void setVideo(Video video) {
        this.video = video;
    }

    public Seguidor getEspectador() {
        return espectador;
    }
    public Video getVideo() {
        return video;
    }

    @Override
    public String toString() {
        return "__________Visualisações___________ " + "\nEspectador: " + espectador + "\nVídeo: " + video;
    } 
}