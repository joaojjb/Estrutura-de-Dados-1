package classes;
public class Contato {
    private String nome;
    private String endereco;
    private long cpf;
    private Contato contato;

    
    public Contato(String nome,String endereco,long cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.contato = null;
    }

    public Contato(){
        this.nome = "";
        this.endereco = "";
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}