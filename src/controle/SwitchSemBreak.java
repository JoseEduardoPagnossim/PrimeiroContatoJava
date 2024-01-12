package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "branca";

        switch (faixa.toLowerCase()){
            case "preta":
            System.out.println("Sei Bassai Dai...");
            case "marrom":
                System.out.println("Sei Tekki Shodan");
            case "roxo":
                System.out.println("Sei Heian Godan");
            case "verde":
                System.out.println("Sei Heian Yodan");
            case "laranja":
                System.out.println("Sei Heian Sandan");
            case "vermelha":
                System.out.println("Sei Heian Nidan");
            case "amarela":
                System.out.println("Sei Heian Shodan");
                /*break;
            default:
                System.out.println("Não sei de nada");*/
        }

        System.out.println("Fim!!");
    }
}
