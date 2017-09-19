
package pct;

import java.util.Scanner;

public class BobbleSorting {
    public static void main(String[] args) {
        //declaração de vetor
        int[] n;
        //criação de vetor
        n = new int[3];
        
        //Criação e instancia de um objeto de entrada
        Scanner entrada = new Scanner(System.in); 
        
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
        
        for (int i = 0; i < 2; i++){
            for(int r = i + 1; r < 3; r++){
                if (n[i] > n[r]) {
                int swap = n[r];
                n[r] = n[i];
                n[i] = swap;
                
            }
            }
             
        }
        
        
        System.out.println("\n \t\t\t -- Saida -- \n");
        System.out.printf("1 - %d \n2 - %d \n3 - %d\n\n\n", n[0],n[1],n[2]);
        
    }
}
