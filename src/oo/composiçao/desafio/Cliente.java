package oo.composiçao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nomeCliente;

    final List<Compra> compras = new ArrayList<>();

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    double obterValorTotal(){
        double total = 0;
        for(Compra compra: compras){
            total += compra.valorCompra();
        }
        return total;
    }

}
