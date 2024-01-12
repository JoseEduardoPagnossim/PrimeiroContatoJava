package desafio.classe.objeto;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        System.out.println(d1.obterData());
        d1.dia = 17;
        d1.mes = 04;
        d1.ano = 2019;
        //String dataDigitada = (d1.obterData(25,04,1997));
        //System.out.println(dataDigitada);
    }
}
