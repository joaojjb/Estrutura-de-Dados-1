public class Contato {
    private String name;
    private String adress;
    private long cpf;
    private Contato contato;

    
    public Contato(String name,String adress,long cpf) {
        this.name = name;
        this.adress = adress;
        this.cpf = cpf;
        this.contato = null;
    }

    public Contato(){
        this.name = "";
        this.adress = "";
        this.cpf = 0;
        this.contato = null;
    }

    public String getContato(){
        return this.contato.toString();
    }

    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
}