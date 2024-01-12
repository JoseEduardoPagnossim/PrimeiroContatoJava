package desafios.pessoa.jantar;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.pessoa = "José Eduardo";
        p1.peso = 120.00;

        System.out.println("Nome e peso antes de comer: \n" + p1.pessoa + "\n" + p1.peso);

        Comida c1 = new Comida();
        c1.comida = "Arroz";
        c1.pesoComida = 0.200;
        Comida c2 = new Comida();
        c2.comida = "Feijao";
        c2.pesoComida = 0.150;
        Comida c3 = new Comida();
        c3.comida = "Bife";
        c3.pesoComida = 0.650;

        System.out.println(c1.comida + "\n" + c1.pesoComida);
        System.out.println(c2.comida + "\n" + c2.pesoComida);
        System.out.println(c3.comida + "\n" + c3.pesoComida);

        System.out.println("-------------------------------------------");

        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);

        System.out.println(p1.apresentar());






    }
}
