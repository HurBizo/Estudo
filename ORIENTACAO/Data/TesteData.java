package pct;
import java.util.Scanner;

public class TesteData {
    public static void main(String[] args) {
        int d = 0, m = 0, a = 0;
        
        //Criação de instancia de um objeto da classe data
        Data data = new Data();
       
        //construção do objeto data
        //data.dia = 1; Obsoleto
        //data.mes = 1;
        //data.ano = 2017;
        Scanner entrada = new Scanner(System.in);
        
        data.setDia(d);
        data.setMes(m);
        data.setAno(a);
        
        //imprimeindo uma data
       
        System.out.println("Data: " + data.imprimirData());
    }
}
