public class ItemCompra {
    private String descricao;
    private int qde;
    private double preco;
    
    public ItemCompra(String descricao, int qde, double preco) {
        this.descricao = descricao;
        this.qde = qde;
        this.preco = preco;
    }

    public boolean setQde(int qde){
        if(qde <= 0) return false;
        //TODO
        return true;
    }

    public boolean setPreco(double preco){
        if(preco < 0.0) return false;
        //TODO
        return true;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public String getItemCompra(){
        //TODO
        return "Item Compra inteiro";
    }

 
}
