public class Fila {
    private class No {
        private Cliente dados;
        private No ant;

        public No(Cliente aux) {
            dados = aux;
            ant = null;
        }
    }
        private No inicio;
        private No fim;
        private int tam;

        public boolean vazia() {
            return inicio == null;
        }

        public int getTamanho() {
            return tam;
        }

        public void enfileirar(Cliente cliente) {

            No aux = new No(cliente);
            if (vazia()) {
                inicio  = aux;
                fim = aux;
                aux = null;
                tam++;
            }
            else{
                fim.ant = aux;
                fim = aux;
                tam++;
            }
           
        }

    public Cliente desenfileirar(){
        if(vazia()){
            return null;
        } 
        No aux = inicio;
        inicio = aux.ant;
        tam--;
        return aux.dados;
    }
}
