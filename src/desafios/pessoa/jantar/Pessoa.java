package desafios.pessoa.jantar;

public class Pessoa {

    String pessoa;
    double peso;

    public Pessoa() {
        this.pessoa = pessoa;
        this.peso = peso ;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.pesoComida;
        }
    }

        String apresentar() {
            return ("Olá eu sou o " + pessoa + " e tenho " + this.peso + " Kgs");
        }



}
