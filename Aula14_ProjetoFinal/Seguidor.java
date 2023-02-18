package Aula14_ProjetoFinal;

public class Seguidor extends Pessoa {
    private String login;
    private int totAssistido;

    public Seguidor(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);//ref para a superclasse Pessoa
        this.totAssistido = 0;
        this.login = login;
    }

    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido()+1);
    }

//----------------------------------------------------------------------------------------------------------------------------------------


    public void setLogin(String login) {
        this.login = login;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    @Override
    public String toString() {
        return nome + "\nLogin: " + login + "\nVideos assistidos: " + totAssistido;
    }

}

