import java.util.Scanner;

public class Base{
    static Scanner leia = new Scanner(System.in);

    static ItemCompra obtemItemCompra(){
        String descricao;
        int qde;
        double preco;

        leia.skip("\\R");
        System.out.println("Descrição: ");
        descricao = leia.nextLine();
        System.out.println("Quantidade: ");
        qde = leia.nextInt();
        System.out.println("Preço: ");
        preco = leia.nextDouble();

        ItemCompra auxItemCompra = new ItemCompra(descricao, qde, preco);

        return auxItemCompra;

        public static void main(String[]args) {
            ItemCompra itemCompra = null;
            Lista lista = new Lista();
            int op;

            do{
                System.out.println("Digite:");
                System.out.println("1 - para empilhar.");
                System.out.println("2 - para desempilhar.");
                System.out.println("3 - para sair.");
                op = leia.nextInt();
                switch(op) {
                    case 1: // empilhar
                    itemCompra = obtemItemCompra();
                    lista.inserirInicio(itemCompra);
                    System.out.println(lista.getLista());
                    itemCompra = null;
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
                }
            }
        } while (op != 3);
    }
}