package desafios;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantNotas = 0;
        double notaAtual = 0;
        double totalNotas = 0;

        while (notaAtual !=  -1){
            System.out.println("Informe a nota (ou -1 para sair): ");
            notaAtual = entrada.nextDouble();

            if (notaAtual<=10 && notaAtual>=0){
                totalNotas+=notaAtual;
                quantNotas ++;
            }
        }

        double media = totalNotas/quantNotas;
        System.out.println("Media " + media);

        entrada.close();
    }
}
