public class Cliente {
    private String nome;
    private String cpf;
    private String fone;

    public Cliente(String nome, String cpf, String fone){
        this.nome = nome;
        this.cpf = cpf;
        this.fone = fone;
    }

    public String getCliente(){
        return this.nome +  " \n" +  this.cpf + "\n" + this.fone + "\n";
    }
}
