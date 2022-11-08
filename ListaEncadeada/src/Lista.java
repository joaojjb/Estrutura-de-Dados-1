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
        aux.proximo = primeiro;
        primeiro = aux;
        qde++;
    }

    public ItemCompra retirar(ItemCompra itemCompra){
        if(vazia()) return null;

        No noAux = primeiro;
        No noAnt = primeiro;
        ItemCompra auxItemCompra = noAux.dados;
        for(int i = 0; i < qde; i++){
            if(noAux != null && itemCompra.getDescricao().equals(noAux.dados.getDescricao())){
                auxItemCompra = noAux.dados;
                //retirada caso sja o primeiro Nó;
                if(i == 0){
                    primeiro = noAux.proximo;
                //retirada caso não seja o último nem o primeiro.
                }else if(noAux.proximo != null){
                    noAnt.proximo = noAux.proximo;
                //retirada caso seja o último
                }else{
                    noAnt.proximo = null;
                }
                qde--;
                return auxItemCompra;
            } else {
                noAnt = noAux;
                noAux = noAux.proximo;
            }
        }
        return null;
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
        No auxNo = primeiro;
        String listaConcatenada = "";
        for(int i = 0; i < qde; i++){
            listaConcatenada+= "\n " + auxNo.dados.getItemCompra() + "\n\n ";
            auxNo = auxNo.proximo;
        }

        return listaConcatenada;
    }
}

