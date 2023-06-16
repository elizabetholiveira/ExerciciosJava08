package LojaLivrosCdDvd;

public class CDs extends Itens{

    private int numeroDeFaixas;

    public CDs(String nome, double preco, int codigoDeBarras, int numeroDeFaixas) {
        super(nome, preco, codigoDeBarras);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public void detalhesItens() {
        System.out.println("Tipo: CD");
        System.out.println("Nome: " + getNome());
        System.out.printf("Preço: R$%,.2f%n", getPreco());
        System.out.println("Número de faixas: " + getNumeroDeFaixas());
    }
}
