
package pct;


public class TesteData {
    public static void main(String[] args) {
        //Criação de instancia de um objeto da classe data
        Data data = new Data();
        
        //construção do objeto data
        data.dia = 1;
        data.mes = 1;
        data.ano = 2017;
        
        //imprimeindo uma data
        System.out.println("Data: " + data.imprimirData());
    }
}
