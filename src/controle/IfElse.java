package controle;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o valor: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("Numero é par!");
        } else
            System.out.println("Numero é impar!");
    }
}
