package oo.composiçao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private Item compra;
    List<Item> itens = new ArrayList<>();



    public void adicionarItem(String nome,double preco, int qtde){
        var produto = new Produto(nome,preco);
        this.itens.add(new Item(produto,qtde));
    }

    public void adicionarItem(Produto p,int qtde){
        this.itens.add(new Item(p,qtde));
    }


    public double valorCompra(){
        double total = 0;
        for(Item item: itens){
            total += item.quantidade * item.produto.valorProduto;
        }
        return total;
    }
    public Item getCompra() {
        return compra;
    }

    public void setCompra(Item compra) {
        this.compra = compra;
    }
}
