package oo.composiçao;

public class Motor {

    double fatorInjeçao = 1;
    boolean ligado = false;


    int giros(){
        if (!ligado) {
            return 0;
        } else{
            return (int) Math.round(fatorInjeçao * 3000);
        }
    }
}
