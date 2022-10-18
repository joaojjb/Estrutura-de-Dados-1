import java.util.Scanner;
public class App {
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
            System.out.println("1 - para empilhar.");
            System.out.println("2 - para desempilhar.");
            System.out.println("3 - para sair.");
            op = leia.nextInt();
            switch (op) {
                case 1: // empilhar
                    cliente = obtemLCliente();
                    fila.enfileirar(cliente);
                    System.out.println(fila.getQde() + " Livros.");
                    liv = null;
                    break;
                case 2: // desempilhar
                    liv = p.pop();
                    if (liv == null)
                        System.out.println("Pilha vazia.");
                    else {
                        System.out.println(liv.getLivro());
                        System.out.println(p.getQde() + " Livros.");
                    }
                    liv = null;
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
    }
}
