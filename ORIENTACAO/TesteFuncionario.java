package pct;

public class TesteFuncionario {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNumRegistro(102);
        funcionario.setNome("Legal");
        funcionario.setSalario(1652.23);
        funcionario.setNivel('P');
        funcionario.setAfastado(true);
       ;
        
        System.out.println("\t\t\n -- Apresentação do funcionário --");
        funcionario.apresentarFuncionario();
        
        System.out.println("\t\t\n -- Desconto INSS --");
        funcionario.descontarInss();
        
    }
}
