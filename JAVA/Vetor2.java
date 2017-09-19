
package pct;

import java.util.Scanner;

public class BobbleSorting {
    public static void main(String[] args) {
        //Criação de veriáveis
         Scanner entrada = new Scanner(System.in); 
        int[] n ;
        
        System.out.println("Quantos valores?");
        n = new int[entrada.nextInt()];
        
        //Criação e instancia de um objeto de entrada
       
        
        System.out.println("\n\t\t\t -- Ordenação de 3 valores -- ");
        
        //Entrada
        /*System.out.println("Informar o 1º Valor: ");
        n[0] = entrada.nextInt();
        
        System.out.println("Informar o 2º Valor: ");
        n[1]= entrada.nextInt();
        
        System.out.println("Informar o 3º Valor: ");
        n[2] = entrada.nextInt();
        */
        
        for(int i = 0; i < n.length; i++){
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            n[i] = entrada.nextInt();
        }
        
        
        
        //processamento
        
        for (int i = 0; i < (n.length - 1); i++){
            for(int r = i + 1; r < n.length; r++){
                if (n[i] > n[r]) {
                int swap = n[r];
                n[r] = n[i];
                n[i] = swap;
                
            }
            }
             
        }
        
        
        for (int i = 0 ; i < n.length; i++){
            System.out.println((i+1) + " - "+ n[i]);
        }
        
    }
}
