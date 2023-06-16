package LojaLivrosCdDvd;

public class Livros extends Itens {

    private String autor;

    public Livros(String nome, double preco, int codigoDeBarras, String autor) {
        super(nome, preco, codigoDeBarras);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void detalhesItens() {
        System.out.println("Tipo: Livro");
        System.out.println("Nome: " + getNome());
        System.out.printf("Preço: R$%,.2f%n", getPreco());
        System.out.println("Autor: " + getAutor());
    }
}
