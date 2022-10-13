import java.util.Scanner;
import classes.Contato;
import classes.ListaOrdenada;

public class TestaLista {
    public static Scanner input = new Scanner(System.in);

    public static Contato criarContato() {
        String name, adress;
        long cpf;
        Contato contato = new Contato();

        System.out.print("Insira seu nome: ");
        name = input.next();
        input.reset();
        contato.setNome(name);

        System.out.print("Insira seu cpf: ");
        cpf = input.nextLong();
        contato.setCpf(cpf);

        System.out.print("Insira seu endereço: ");
        adress = input.next();
        contato.setEndereco(adress);

        return contato;
    }

    public static void main(String[] args) throws Exception {
        ListaOrdenada lista = new ListaOrdenada();
        int op = 0, tamLista = 0;
        Contato contato = null;

        do {
            System.out.println("1. Para criar uma Lista");
            System.out.println("2. Para listar um Contato");
            System.out.println("3. Para retirar um contato");
            System.out.println("4. Para pegar a lista inteira");
            System.out.println("5. Para encerrar o programa");
            op = input.nextInt();
            input.reset();

            switch (op) {
                case 1:
                    do {
                        System.out.println("Digite o tamanho da lista: ");
                        tamLista = input.nextInt();
                    } while (lista.setMaxTam(tamLista) != true);
                    break;

                case 2:
                    contato = criarContato();
                    if (lista.insereOrdenado(contato) == true) {
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

                    if (contato != null) {
                        System.out.println("Nome: " + contato.getNome() + " " + "Endereço: " + contato.getEndereco()
                                + " " + "CPF: " + contato.getCpf());
                    } else {
                        System.out.println("Esse contato não existe !");
                    }
                    contato = null;
                    break;

                case 4:
                    System.out.println("Name " + "CPF " + "Adress ");
                    System.out.print(lista.getLista());
                    break;

                case 5:
                    System.out.println("Encerrando....");
            }
        } while (op != 5);
    }
}
