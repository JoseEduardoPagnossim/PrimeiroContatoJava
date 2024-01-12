package oo.composiçao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria Julia Moraes");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.9, 100);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Lapis", 1.20, 250);
        compra2.adicionarItem("Celular",1900, 3);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());


    }
}
