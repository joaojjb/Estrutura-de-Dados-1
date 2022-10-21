import java.util.Scanner;
public class Base {
    static Scanner leia = new Scanner(System.in);

    static Cliente obtemLCliente() {
        String nome, cpf, fone;
        leia.skip("\\R");
        System.out.println("Nome: ");
        nome = leia.nextLine();
        System.out.println("Cpf: ");
        cpf = leia.nextLine();
        System.out.println("Telefone: ");
        fone = leia.nextLine();
        Cliente aux = new Cliente(nome, cpf, fone);
        return aux;
    }

    public static void main(String[] args) {
        Cliente cliente = null;
        Fila fila = new Fila();
        int op;
        do {
            System.out.println("Digite:");
            System.out.println("1 - Para enfileirar.");
            System.out.println("2 - Para desenfileirar.");
            System.out.println("3 - para sair.");
            op = leia.nextInt();
            switch (op) {
                case 1: // enfileirar
                    cliente = obtemLCliente();
                    fila.enfileirar(cliente);
                    System.out.println(fila.getTamanho() + " Clientes.");
                    cliente = null;
                    break;
                case 2: // desenfileirar
                cliente = fila.desenfileirar();
                    if (cliente == null)
                        System.out.println("Fila vazia.");
                    else {
                        System.out.println(cliente.getCliente());
                        System.out.println(fila.getTamanho() + " Clientes.");
                    }
                    cliente = null;
                    break;
                case 3: // sair
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 3);
    }
}
    

