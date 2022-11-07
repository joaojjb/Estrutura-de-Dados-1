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
        //TODO
    }

    public ItemCompra retirar(ItemCompra itemCompra){
        //TODO

        return itemCompra;
    }

    
}

