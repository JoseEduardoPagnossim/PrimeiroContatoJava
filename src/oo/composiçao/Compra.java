package oo.composiçao;

import java.util.ArrayList;

public class Compra {

    String cliente;

    ArrayList<Produto> produto = new ArrayList<>();

    double obterValorCompra(){
        double total = 0;

        for (Produto produto: produto){
            total += produto.quantidade * produto.preco;
        }
        return total;
    }


}
