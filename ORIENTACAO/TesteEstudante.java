package pct;

public class TesteEstudante {
    public static void main(String[] args) {
        
        Estudante estud = new Estudante();
        
     
        estud.nome = "João" ;
        estud.frequencia = 99.99;
        estud.matriculaTrancada = true;
        estud.ra = 122222222;
        estud.nota = 'B';
        
        //Imprimir
        
        System.out.println("\t\t\t-- Estudante --\n");
        
        estud.exibirEstudante();
         
        
    }
}
