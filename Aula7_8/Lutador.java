package Aula7_8;

public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private double altura, peso;
    private int idade, nVitorias, nDerrotas, nEmpates;

    //Construtor
    public Lutador(String no, String na, int id, double a, double p, int vi,int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = a;
        setPeso(p);
        this.nVitorias = vi;
        this.nDerrotas = de;
        this.nEmpates = em;
    }

    //-----------------Métodos especiais------------------------

    //Setters
    public void setNome(String n) {
        this.nome = n;
    }
    public void setAltura(double a) {
        this.altura = a;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public void setPeso(double p) {
        this.peso = p;
        setCategoria(); //this.Categoria automaticamente configurada de acordo com o this.peso guardado po setPeso();
    }
    private void setCategoria() { //privado, pois ela é usada dentro do setPeso()
        if (this.peso<52.2) {
            this.categoria = "Inválido";
        }else if (this.peso<=70.3) {
            this.categoria = "Leve";
        }else if (this.peso<=83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public void setVitorias(int v) {
        this.nVitorias = v;
    }
    public void setDerrotas(int d) {
        this.nDerrotas = d;
    }
    public void setEmpates(int em) {
        this.nEmpates = em;     
    }

    //Getters
    public String getNome() {
        return this.nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return this.peso;
    }
    public double getAltura() {
        return this.altura;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getVitorias() {
        return this.nVitorias;
    }
    public int getDerrotas() {
        return this.nDerrotas;
    }
    public int getEmpates() {
        return this.nEmpates;
    }

    //-----------------Métodos normais------------------------
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
    public void apresentar() {
        System.out.println("--------Apresentação--------");
        System.out.println("Nome do lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("------------------------------");
    }
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("diretamente de " + this.getNacionalidade());
        System.out.println("ganhou " + this.getVitorias() + " vezes");
        System.out.println("perdeu " + this.getDerrotas() + " vezes");
        System.out.println("empatou " + this.getEmpates() + " vezes");
        System.out.println("------------------------------");
    }

}