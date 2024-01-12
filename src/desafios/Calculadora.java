package desafios;


import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args){

    Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        float num1 = entrada.nextFloat();
        System.out.println("Informe a operação: ");
        String operador = entrada.next();
        System.out.println("Informe o numero: ");
        float num2 = entrada.nextFloat();


        //logica do programa

        float resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "%".equals(operador) ? num1 % num2 : resultado;





        System.out.printf("%.2f  %s  %.2f = %s", num1,operador,num2,resultado);


    entrada.close();
    }
}
