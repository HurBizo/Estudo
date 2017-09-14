
package pct;

public class Data {
    // atributo
    private int dia;
    private int ano;
    private int mes;
    
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
    public void setMes(int mes){
        if(mes >= 1 && mes <=12){
            this.mes = mes;
        }else{
            System.out.println("Digite um dia válido!");
            this.dia = 03;
        }
    }
    public void setAno(int ano){
        if(ano <= 2017){
            this.ano = ano;
        }else{
            System.out.println("Digite o anoa atual ou inferior!");
            this.ano = 2012;
        }
    }
    
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.dia;
    }
    public int getAno(){
        return this.dia;
    }
}

