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
        if(dia >= 1 && dia <=31){
            this.dia = dia;
        }else{
            System.out.println("Digite um dia válido!");
            this.dia = 1;
        }
        
    }
    
    public int getDia(){
        return this.dia;
    }
}
