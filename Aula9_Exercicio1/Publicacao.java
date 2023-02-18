package Aula9_Exercicio1;

public interface Publicacao { //Interface
    // Classes abstratas
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folear(int p); //criar um método para conseguir navegar no livro
    public abstract void avancarPag();
    public abstract void voltarPag();
}
