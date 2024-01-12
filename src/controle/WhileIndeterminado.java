package controle;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while (!valor.equalsIgnoreCase("Sair")){
            System.out.println("Voce diz ");
            valor = entrada.nextLine();
        }
        entrada.close();

    }
}
