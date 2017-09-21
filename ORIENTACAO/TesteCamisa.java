
package pct;

public class TesteCamisa{
    public static void main(String[] args) {
        Camisa cami = new Camisa();
        
        cami.setDescricao("bu");
        cami.setPrecoUnitario(0);
        cami.setQuantidade(0);
        cami.setTamanho('p');
        cami.setDisponivel(true);
        
        //imprimir 
        
        System.out.println("\t\t\t Estoque \n");
        
        cami.imprimirCamisa();
       
    }
}
