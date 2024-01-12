package desafio.classe.objeto;

public class Data {

    int dia = 5;
    int mes;
    int ano;

    public Data(){
        dia = 01;
        mes = 01;
        ano = 1970;
    }
    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    String obterData(){
        return dia +"/" + mes + "/" + ano;
    }
    String obterData(int dd, int mm, int aa){
        return dd +"/" + mm + "/" + aa;
    }
}
