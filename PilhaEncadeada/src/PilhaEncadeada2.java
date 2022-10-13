
import java.util.Scanner;

public class PilhaEncadeada2 {
    static Scanner leia = new Scanner(System.in);

    static Livro obtemLivro() {
        String t, a, e;
        leia.skip("\\R");
        System.out.println("Titulo: ");
        t = leia.nextLine();
        System.out.println("Autor: ");
        a = leia.nextLine();
        System.out.println("Editora: ");
        e = leia.nextLine();
        Livro aux = new Livro(t, a, e);
        return aux;
    }

    public static void main(String[] args) {
        Livro liv = null;
        Pilha p = new Pilha();
        int op;
        do {
            System.out.println("Digite:");
            System.out.println("1 - para empilhar.");
            System.out.println("2 - para desempilhar.");
            System.out.println("3 - para sair.");
            op = leia.nextInt();
            switch (op) {
                case 1: // empilhar
                    liv = obtemLivro();
                    p.push(liv);
                    System.out.println(p.getQde() + " Livros.");
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
