
package pct;


public class Estudante {
    int ra = 0;
    String nome;
    double frequencia = 0;
    boolean matriculaTrancada;
    char nota;
    
    
    //Metodo
    public void exibirEstudante(){
        System.out.println("RA: "+ ra);
        System.out.println("Nome: " + nome);
        System.out.println("Frequencia: " + frequencia);
        System.out.println(matriculaTrancada?"Matricula: Trancada":"Matricula: Regular");
        System.out.println("Nota: "+ nota);
    }
    
}
