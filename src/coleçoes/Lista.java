package coleçoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Jose"));
        lista.add(new Usuario("Lia" ));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3).nome); //deixar claro que conseguimos acessar pelo indice(index) diferente do conjunto

        for(Usuario u:lista){
            System.out.println(u.nome);
        }


    }
}
