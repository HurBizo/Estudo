package pct;


public class Camisa {
    private String descricao;
    private double precoUnitario = 50.00;
    private int quantidade = 1;
    private char tamanho;
    private boolean disponivel;
    
    //metodo 
    
    public void imprimirCamisa(){
        System.out.println("Descrição: " + descricao + "\nPreço: "+ precoUnitario + "\nQuantidade: " + quantidade + "\nTamanho: " + tamanho);
        System.out.println(disponivel?"Disponivel" : "Sem estoque");
    }
    
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setTamanho(char tamanho){
        this.tamanho = tamanho;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    public double getPrecoUnitario(){
        return this.precoUnitario;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public boolean getDisponivel(){
        return this.disponivel;
    }
}
