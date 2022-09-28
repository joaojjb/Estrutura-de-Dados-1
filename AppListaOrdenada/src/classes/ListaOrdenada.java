package classes;

public class ListaOrdenada {
    private int ultimo;
    private int maxTam;
    private Contato [] vetor;

    public ListaOrdenada(){
        this.ultimo = 0;
        this.maxTam = 0;
        this.vetor = null;
    }

    public boolean listaVazia(){
        if(ultimo == 0) return true;

        return false;
    }
    
    public boolean listaCheia(){
        if(ultimo == maxTam) return true;

        return false;
    }

    public boolean setMaxTam(int maxTam) {
        if(maxTam < 2){
            System.out.println("Lista muito pequena");
             return false;
        }

        this.maxTam = maxTam;
        this.vetor = new Contato[this.maxTam];
       
        return true;
        
    }

    public int getMaxTam() {
        return maxTam;
    }

    public boolean insereOrdenado(Contato contato){
        int pos = 0;
        if(listaCheia()){
            System.out.println("A lista está cheia !"); 
            return false;
        } 

        if(ultimo == 0){
            vetor[0] = contato;
            ultimo++;
            return true;
        } 
        
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == null){
                vetor[i] = contato;
                ultimo++;
                return true;
            } else {
                if(contato.getCpf() < vetor[i].getCpf()){
                    pos = i;
                    
                    for(int j = ultimo; j > pos; j--){
                        vetor[j] = vetor[j - 1];
                    }
                    vetor[pos] = contato;
                    ultimo++;
                    return true;
                }
            }
        }
        return false;
    }

    public Contato search(Contato contato){
        Contato aux = new Contato();
        for(int i = 0; i < this.ultimo; i++){
            if(this.vetor[i].getCpf() == contato.getCpf()){
                aux = vetor[i];
                vetor[i] = null;
                return aux;
                }
            }
                return null;
            }
            

    public Contato retiraLista(Contato contato){
        Contato [] vetor = this.vetor;
        if(listaVazia()) return null;
        contato = search(contato);
        if(contato == null) return null;
        
        for(int i = 0; i < ultimo - 1; i++){
            //Avançando o vetor
            if(vetor[i] == null){
                vetor[i] = vetor[i+1];
                vetor[i+1] = null;
            }
        }
        ultimo--;
        return contato;
    }

    public String getLista(){
        String name, adress;
        long cpf;
        String aux = "";

        for(int i = 0; i < ultimo; i++){
            adress = this.vetor[i].getEndereco();
            name = this.vetor[i].getNome();
            cpf = this.vetor[i].getCpf();
            aux = aux + name + "    " + cpf + "    " + adress + "   \n";
                
        }
            return aux;   
        
        
    }
}
