package desafios;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        System.out.println("Digite o dia da semana desejado: ");
        Scanner entrada = new Scanner(System.in);
        String diaSema = entrada.next();


        if (diaSema.equalsIgnoreCase("Domingo")){
            System.out.println("01");
        } else if (diaSema.equalsIgnoreCase("Segunda")){
            System.out.println("02");
        } else if (diaSema.equalsIgnoreCase("Terça")){
            System.out.println("03");
        } else if (diaSema.equalsIgnoreCase("Quarta")){
            System.out.println("04");
        } else if (diaSema.equalsIgnoreCase("Quinta")) {
            System.out.println("05");
        } else if (diaSema.equalsIgnoreCase("Sexta")){
            System.out.println("06");
        } else if(diaSema.equalsIgnoreCase("Sabado")){
            System.out.println("07");
        } else
            System.out.println("Dia nao encontrado!!");

                entrada.close();
    }
}
