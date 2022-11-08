public class Lista {
    public class No{
        private ItemCompra dados;
        private No proximo;

        public No(ItemCompra dados){
            this.dados = dados;
            proximo = null;
        }
    }

    private No primeiro;
    private int qde;

    public void inserirInicio(ItemCompra itemCompra){
        No aux = new No(itemCompra);

        if(vazia()){
            primeiro = aux;
            qde++;
            aux = null;
        } else {
            aux.proximo = primeiro;
            primeiro = aux;
            qde++;
            aux = null;
        }

        
        
    }

    public ItemCompra retirar(ItemCompra itemCompra){
        

        return itemCompra;
    }

    public ItemCompra buscar(ItemCompra itemCompra) {
        if(vazia()) return null;

        No noAux = primeiro;

        for(int i = 0; i < qde; i++){
            if(noAux != null && itemCompra.getDescricao().equals(noAux.dados.getDescricao())){
                ItemCompra auxItemCompra = noAux.dados;
                return auxItemCompra;
            } else {
                noAux = noAux.proximo;
            }
        }
        return null;
    }
    
    public boolean vazia(){
        if(primeiro == null) return true;

        return false;
    }

    public int getQde(){
        return this.qde;
    }

    public String getLista(){
        //TODO
    }
}

