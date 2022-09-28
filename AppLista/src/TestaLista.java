import java.util.*;
public class TestaLista {
    public static Scanner input = new Scanner(System.in);
    public static Contato criarContato(){
        String nome, endereco;
        long cpf;
        Contato aux = new Contato();

        System.out.print("Insira seu nome: ");
        nome = input.next();
        input.reset();
        aux.setNome(nome);
        

        System.out.print("Insira seu cpf: ");
        cpf = input.nextLong();
        aux.setCpf(cpf);
        

        System.out.print("Insira seu endereço: ");
        endereco = input.next();
        aux.setEndereco(endereco);
        

        return aux;

    }
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();
        int op = 0, tamLista = 0;
        Contato contato = null;

        do{
            System.out.println("1. Para criar uma Lista");
			System.out.println("2. Para listar um Contato");
			System.out.println("3. Para retirar um contato");
			System.out.println("4. Para pegar a lista inteira");
            System.out.println("5. Para encerrar o programa");
			op = input.nextInt();
            input.reset();

            switch(op){
                case 1:
                do 
				 {
				 System.out.println("Digite o tamanho da lista: ");
				 tamLista = input.nextInt();
				 }
				 while(lista.setMaxTam(tamLista) != true);
				 break;
                 
                case 2:
                contato = criarContato();
                if(lista.insereFinal(contato) == true){
                    System.out.println("Contato inserido com sucesso !");
                    System.out.println("");
                } else {
                    System.out.println("Contato não inserido !");
                }
                contato = null;
                break;

                case 3:
                    contato = criarContato();
                    contato = lista.retiraLista(contato);

                    if(contato != null){
                        System.out.println("Nome: " + contato.getNome() + " " + "Endereço: " + contato.getEndereco() + " " + "CPF: " + contato.getCpf());
                    } else{
                        System.out.println("Esse contato não existe !");
                    }

                    contato = null;
                break;

                case 4:
                System.out.println("Name " + "CPF " + "Adress ");
                System.out.print(  lista.getLista());

                case 5:
                System.out.println("Encerrando....");


            }
        }while(op != 5);
    }
}
