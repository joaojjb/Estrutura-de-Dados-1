import javax.naming.AuthenticationException;

public class Lista {
    private int ultimo;
    private int maxTam;
    private Contato [] vetor;

    public Lista(){
        this.ultimo = 0;
        this.maxTam = 0;
        this.vetor = null;
    }

    public int getMaxTam() {
        return maxTam;
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

    public boolean listaVazia(){
        if(ultimo == 0) return true;

        return false;
    }

    public boolean listaCheia(){
        if(ultimo == maxTam) return true;

        return false;
    }

    public boolean insereFinal(Contato contato){
        if(listaCheia()){
            System.out.println("A lista está cheia !"); 
            return false;
        } 

        vetor[ultimo] = contato;
        ultimo++;
        return true;
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

