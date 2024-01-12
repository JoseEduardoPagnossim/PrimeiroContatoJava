package coleçoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila= new LinkedList<>();
        /*Offer e Add -> adiciona elementos na fila
        Diferença é o comportamento quando a fila esta chega!
         */
        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        //os dois buscam o proximo da fila, peek retorna nulo quando a fila está vazia
        //element retorna uma exceção no codigo
        System.out.println(fila.peek());
        System.out.println(fila.element());

        System.out.println(fila.size());
        //System.out.println(fila.isEmpty());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());



    }
}
