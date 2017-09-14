
package pct;

public class Data {
    // atributo
    private int dia;
    int ano;
    int mes;
    
    //Métodos
    
    public String imprimirData(){
        return dia + "/" + mes + "/" + ano;
       
    }
    public void setDia(int dia){
        this.dia = dia;
    }
}
