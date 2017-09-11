
package pct;
import java.util.Scanner;
public class ValidadorCPF {
    public static void main(String[] args) {
        
        int soma = 0, idx = 0, d1, d2;
        String cpf;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\t\t\t Validador de Cpf \n");
        
        System.out.print("Informe aqui o seu cpf: ");
        cpf = entrada.next();
        
        //Verificar se o cpf tem 11 caracter
        if(cpf.length() == 11){
            
            for(int i = 10; i >= 2; i--){
                soma += Character.getNumericValue(cpf.charAt(idx)) * i;
                idx++;
            }
            
            d1 = soma % 11;
            
            if(d1 >= 2){
                d1 = 11 - d1;
            }else{
                d1 = 0;
            }
            soma = 0;
            idx = 0;
            
            for(int i = 11; i >= 2; i--){
                soma += Character.getNumericValue(cpf.charAt(idx)) * i;
                idx++;
            }
            
            d2 = soma % 11;
            
            if(d2 >= 2){
                d2 = 11 - d2;
                } else {
                    d2 = 0;
                }
 
            
            if(d1 == Character.getNumericValue(cpf.charAt(9)) && d2 == Character.getNumericValue(cpf.charAt(10))){
                System.out.println("CPF válido!");
            }
            else{
                System.err.println("CPF inválido!");
            }
        } else {
            System.err.println("Cpf: " + cpf + " tem a quantidade de dígitos incorreto!");
        }
    }
}
