//package pct;

import java.util.Scanner;

public class IRRF {

    public static void main(String[] args) {
        
        double salarioBruto,Sl=0.0,IRd=0.0,Ib,salB=0.0, val=189.59, dependentes, liq=0.0;
    
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\t\t\t\t Calculo de Imposto de Renda \n");
        
        System.out.println("Digite o salário bruto: ");
        salarioBruto = entrada.nextDouble();
        
        System.out.println("Digite o número de dependentes: ");
        dependentes = entrada.nextDouble();
        
        val *= dependentes;
        
        if(salarioBruto < 1903.99){
            System.out.println("Voê está insento do Imposto de Renda!"); 
            
        }else if(salarioBruto < 2826.65 ){
            salB = salarioBruto - val;
            Ib = salB * 0.075;
            IRd = Ib - 142.80;
            Sl = salarioBruto - IRd;
            liq = 7.5;
            
        }else if(salarioBruto < 3751.05){
            salB = salarioBruto - val;
            Ib = salB * 0.15;
            IRd = Ib - 354.80;
            Sl = salarioBruto - IRd;
            liq = 15;
            
        }else if(salarioBruto < 4664.68){
            salB = salarioBruto - val;
            Ib = salB * 0.225;
            IRd = Ib - 636.13;
            Sl = salarioBruto - IRd;
            liq = 22.50;
            
        }else{
            salB = salarioBruto - val;
            Ib = salB * 0.275;
            IRd = Ib - 836.36;
            Sl = salarioBruto - IRd;
            liq = 27.50;
            
        }
        
        System.out.printf("Salario bruto: %.2f\n", salarioBruto);
        System.out.printf("Salario base: %.2f\n", salB );
        System.out.printf("Aliquota: %.2f", liq);
        System.out.println("%");
        System.out.printf("\nIR devido: %.2f \n", IRd);
        System.out.printf("Salario liquido: %.2f \n", Sl);
        
        
    }
    
}
