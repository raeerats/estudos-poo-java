package Aula9_Exercicio1;

public class Livro implements Publicacao {
    // Atributos
    private String titulo, autor;
    private Pessoa leitor; //classe Pessoa se tornando variável
    private int totalPag, pagAtual;
    private boolean aberto, fechado;

    //Construtor
    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {// leitor == Pessoa (classe)
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        setPagAtual(0);
        setFechado(true); //livro começará fechado;
        this.leitor = leitor;
    }

    //AÇÕES
    public void abrir() {
        if(this.getFechado()) {
            this.setAberto(true); //abrindo
            this.setFechado(false); 
        } else {
            System.out.println("Livro já está aberto.");
        }
    }
    public void fechar() {
        if(this.getAberto()) {
            this.setFechado(true); //fechando
            this.setAberto(false);
        } else {
            System.out.println("Livro já está fechado.");
        }
    }
    public void folear(int p) {
        if(this.getAberto()) {
            if (p < this.getTotalPag()) {
                this.setPagAtual(p); //foleando até a pg p
            } else {
                System.out.println("Livro já está fechado.");
            }
        }
    }
    public void avancarPag() {
        if (this.getAberto()) { //para avançar a pg, livro precisa estar aberto
            this.pagAtual++; //setando valor (+1 página passada) no getPgAtual, ex: pg 1, pg 2
        } else {
            System.out.println("Livro está fechado. Impossivel avançar página.");
        }
    }
    public void voltarPag() {
        if (this.getAberto()) {
            this.pagAtual--; //tirando valor (-1 pagina, voltando páginas) no getPgAtual, ex: pg 6, pg 5;
        } else {
            System.out.println("Livro está fechado. Impossivel voltar página.");
        }
    }
    // Exibição
    public String detalhes() {
        return "_______BIBLIOTECA VIRTUAL_______ \n"+ "titulo: "+ this.getTitulo() + "\nautor: " + this.getAutor() + "\ntotal de páginas: " + this.getTotalPag() + "\npagina atual: " + this.getPagAtual() + "\naberto?: " + this.getAberto() + "\nleitor: "+ leitor.getNome();
    }

//--------------------------------------------------------------------------------------------------------------------------------------------------------
    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }
    // Getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getTotalPag() {
        return totalPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public boolean getFechado() {
        return fechado;
    }
}
