package arrays;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos?");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtdNota = entrada.nextInt();

        double[][] notaDaTurma = new double [qtdAlunos][qtdNota];

        double notaTotal = 0;
        for (int i = 0; i < notaDaTurma.length; i ++ ){
            for (int j = 0; j < notaDaTurma[i].length; j++){
                System.out.printf("Informe a nota %d do aluno %d: ",(j + 1),(i +  1));
            notaDaTurma[i][j] = entrada.nextDouble();
            notaTotal += notaDaTurma[i][j];
            }
        }

            double mediaTotal = notaTotal / (qtdNota*qtdAlunos);
            System.out.println("Média da turma: " + mediaTotal);


        entrada.close();
    }
}
