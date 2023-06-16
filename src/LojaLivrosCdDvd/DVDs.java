package LojaLivrosCdDvd;

public class DVDs extends Itens{

    private int duracaoMinutos;

    public DVDs(String nome, double preco, int codigoDeBarras, int duracaoMinutos) {
        super(nome, preco, codigoDeBarras);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void detalhesItens() {
        System.out.println("Tipo: DVD");
        System.out.println("Nome: " + getNome());
        System.out.printf("Preço: R$%,.2f%n", getPreco());
        System.out.println("Duração: " + getDuracaoMinutos() + "min");
    }
}
