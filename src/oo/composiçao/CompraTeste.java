package oo.composiçao;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();

        compra1.cliente ="Pedro";
        compra1.produto.add(new Produto("Caneta", 20, 2.99));
        compra1.produto.add(new Produto("Borracha", 12, 2.99));
        compra1.produto.add(new Produto("Caderno", 8, 20.99));

        System.out.println(compra1.produto.size());
        System.out.println(compra1.obterValorCompra());


    }
}
