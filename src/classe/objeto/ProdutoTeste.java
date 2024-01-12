package classe.objeto;



public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook");
        p1.nome = "Notebook";
        p1.preco = 4500;
        p1.desconto = 0.25;

        Produto p2 = new Produto("Celular");
        p2.nome = "Celular";
        p2.preco = 2200;
        p2.desconto = 0.15;

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.desconto + "%");
        System.out.println("R$ "+p1.precoComDesconto());
        System.out.println(p2.precoComDescontoNatal(0.10));

        System.out.println("_______________________________");
        Produto.desconto = 0.30;
        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());





    }
}

