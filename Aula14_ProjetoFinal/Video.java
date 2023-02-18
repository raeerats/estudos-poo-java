package Aula14_ProjetoFinal;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao /*0-10*/, views, curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public void play() {
        if(!this.getReproduzindo()){
            this.setReproduzindo(true);
        }else{
            System.out.println("Vídeo já está sendo reproduzido");
        }
    }
    @Override
    public void pause() {
        if(this.getReproduzindo()){
            this.setReproduzindo(false);
        }else{
            System.out.println("Vídeo já está pausado.");
        }
    }
    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1); //adicionando o like no vídeo
    }

//----------------------------------------------------------------------------------------------------------------------------------------

public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public void setAvaliacao(int avaliacao) {
    this.avaliacao = avaliacao;
}
public void setCurtidas(int curtidas) {
    this.curtidas = curtidas;
}
public void setViews(int views) {
    this.views = views;
}
public void setReproduzindo(boolean reproduzindo) {
    this.reproduzindo = reproduzindo;
}

public String getTitulo() {
    return titulo;
}
public int getAvaliacao() {
    return avaliacao;
}
public int getCurtidas() {
    return curtidas;
}
public int getViews() {
    return views;
}
public boolean getReproduzindo() {
    return reproduzindo;
}

@Override
public String toString() {
    return titulo + "\nViews: " + views + "\nLikes: " + curtidas + "\nAvaliações: " + avaliacao ;
}

}
