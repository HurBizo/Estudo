package pct;

import java.util.Scanner;


public class Tabela1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int soma=0,c = 0;
        
        int[] p = new int[3];
       
        
        System.out.println("\n\t\t\t == CAMPEONATO BRASILEIRO 2017 ==");
        
        for(int i=0; i < p.length; i++){
            System.out.println("Informe o núm. de pontos do time " + (i + 1) + ":");
            p[i] = entrada.nextInt();          
        }
        
        //media
        
        for(int i=0; i < p.length; i++){
           soma +=  p[i];   
        }
        c = soma / 3;
        
        System.out.println("\n\t\t\t Media: " + c +"\n\n\n");
        
        
        //saida
        for(int i = 0; i < p.length; i++){
            System.out.println("Time" + (i + 1)+"................."+ p[i]);
        }
        
        
        
    }
}
