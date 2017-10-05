package pct;

public class Funcionario {
    private int numRegistro;
    private String nome;
    private double salario;
    private char nivel;
    private boolean afastado;
    
    
    //Metodo
    
    public void apresentarFuncionario(){
        System.out.println("Número de registro: " + numRegistro + "\nNome: " + nome + "\nSalario: " + salario + "\nNivel: " + nivel);
        System.out.println(afastado?"Afastado" : "Ativo");
    }
    
    public void descontarInss(){
        this.salario *= 0.9;
        System.out.println("Com desconto INSS: " + salario);
    }
    
    public void setNumRegistro(int numRegistro){
        this.numRegistro = numRegistro;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setNivel(char nivel){
        this.nivel = nivel;
    }
    
    public void setAfastado(boolean afastado){
        this.afastado = afastado;
    }
    
     public int getNumRegistro(){
        return this.numRegistro;
    }
      public String getNome(){
        return this.nome;
    }
       public double getSalario(){
        return this.salario;
    }
        public char getNivel(){
        return this.nivel;
    }
        public boolean getAfastado(){
        return this.afastado;
    }
       
    
}
