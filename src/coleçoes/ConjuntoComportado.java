package coleçoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        //Set<String> listaAprovados = new HashSet<>(); ==> sem ordenação de inserção
        SortedSet<String> listaAprovados = new TreeSet<>(); // com ordenaçao de inserção

        listaAprovados.add("Ana");
        listaAprovados.add("Luca");
        listaAprovados.add("Carlos");
        listaAprovados.add("Pedro");


        for (String candidatos:listaAprovados) {
            System.out.println(candidatos);
        }

            Set<Integer> nums = new HashSet<>(); // Não aceita int por exemplo, nao aceita primitivos, somente wrrapers

            nums.add(1);
            nums.add(2);
            nums.add(120);
            nums.add(6);

        for (int n:nums) {
            System.out.println(n);
        }


    }
}
