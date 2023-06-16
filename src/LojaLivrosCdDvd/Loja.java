package LojaLivrosCdDvd;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    public static void main(String[] args) {

        System.out.println("Boas-vindas a minha loja!");

        List<Itens> listaDeItens = new ArrayList<>();

        Itens livro1 = new Livros("Crepúsculo", 25.00, 0001, "Pessoa");
        Itens cd1 = new CDs("Xuxa", 10.00, 0002, 15);
        Itens dvd1 = new DVDs("Só para baixinhos", 20.00, 0003, 50);
        Itens livro2 = new Livros("Lua Nova", 25.00, 0004, "Pessoa também");
        Itens dvd2 = new DVDs("Só para baixinhos 2", 20.00, 0005, 55);

        listaDeItens.add(livro1);
        listaDeItens.add(cd1);
        listaDeItens.add(dvd1);
        listaDeItens.add(livro2);
        listaDeItens.add(dvd2);

        for (Itens i : listaDeItens) {
            i.detalhesItens();
            System.out.println("-----");
        }

        //Arrumar bonitinho com Scanner depois
        System.out.println(livro1.equals(cd1));
        System.out.println("-----");

        System.out.println("Olá! Me diga qual produto você está procurando:");
        String perguntaItem = "crepúsculo";
        System.out.println("Você está procurando pelo item: " + perguntaItem);

        String resultado = "Opa";

        for (int i = 0; i < listaDeItens.size(); i++) {
            Itens item = listaDeItens.get(i);
            if (item.getNome().equalsIgnoreCase(perguntaItem)) {
                resultado = "Encontramos o item! Ele está na posição: " + i;
                //System.out.println("Encontramos o item! Ele está na posição: " + i);
                break;
            } else {
                resultado = "Não encontramos o item";
                //System.out.println("Sinto muito! Não encontramos esse item!");
                // i = Integer.MAX_VALUE - 1;
            }

        }

        System.out.println(resultado);

        System.out.println("-----");

        Itens livro1ed1 = new Livros(livro1.getNome(),livro1.getPreco(),livro1.getCodigoDeBarras(), ((Livros) livro1).getAutor());
        Itens livro1ed2 = new Livros(livro1.getNome(),livro1.getPreco(),0011, ((Livros) livro1).getAutor());

        //Fui mandar printar para conferir se tava printando direito, mas por algum motivo o código de barras sempre sai como "9" independente do que eu faça
        /*livro1ed2.detalhesItens();
        System.out.println(livro1ed2.getCodigoDeBarras());*/
    }

}