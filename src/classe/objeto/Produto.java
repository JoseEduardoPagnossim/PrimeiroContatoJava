package classe.objeto;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(String nomeInicial){
        nome = nomeInicial;
    }

    double precoComDesconto(){
        return preco *(1 - desconto);
    }
    double precoComDescontoNatal(double descontoNatal) {
        return preco * (1 - desconto + descontoNatal);
    }

}
