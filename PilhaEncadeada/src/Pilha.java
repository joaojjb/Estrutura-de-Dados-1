
public class Pilha {
    private class No {
        private Livro dados;
        private No prox;

        public No(Livro aux) {
            dados = aux;
            prox = null;
        }
    }

    private No topo;
    private int qde;

    public Pilha() {
        topo = null;
        qde = 0;
    }

    public int getQde() {
        return qde;
    }

    public boolean vazia() {
        return topo == null;
    }

    public void push(Livro x) {
        No aux = new No(x);
        aux.prox = topo; // E o proximo que também é um Nó, faz referência à o anterior, sempre o anterior, isso em pilha e fila funciona mas e no restante?
        topo = aux; // O topo sempre faz referência para o último Nó instânciado.
        qde++;
    }

    public Livro pop() {
        if (vazia())
            return null;
        No aux = topo;
        topo = aux.prox;
        aux.prox = null;
        Livro obj = aux.dados;
        aux.dados = null;
        qde--;
        return obj;
    }
}
