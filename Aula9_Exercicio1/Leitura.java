package Aula9_Exercicio1;

public class Leitura {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];

        Livro[] l = new Livro[5];

        p[0] = new Pessoa("Raquel", 19, "Feminino");
        p[1] = new Pessoa("Fabula", 21, "Masculino");

        l[0] = new Livro("Irmãos Khamazov", "Fiodor Dostoievski", 400, p[1]);

        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }

    public void escolherLivro() { // rodar dentro da classe Livros, escolher um livro pré estabelecido para
                                  // comecar a ler por meio de Pessoa leitor;

    }
}
