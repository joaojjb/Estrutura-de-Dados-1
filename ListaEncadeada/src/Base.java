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
    }
    public static void main(String[]args) {
        ItemCompra itemCompra = null;
        Lista lista = new Lista();
        int op;

        do{
            System.out.println("Digite:");
            System.out.println("1 - para listar.");
            System.out.println("2 - para retirar da lista.");
            System.out.println("3 - para sair.");
            op = leia.nextInt();
            switch(op) {
                case 1: // inserirLista
                    itemCompra = obtemItemCompra();
                    lista.inserirInicio(itemCompra);

                    System.out.println(lista.getLista());
                    itemCompra = null;
                break;

                case 2: // retirar
                    itemCompra = lista.retirar(obtemItemCompra());
                if ( itemCompra == null)
                    System.out.println("Lista vazia.");
                else {
                    System.out.println(itemCompra.getItemCompra());
                    System.out.println(lista.getQde() + " Itens na Lista.");
                }
                    itemCompra = null;
                break;
                
                case 3: // sair
                    System.out.println("Saindo.");
                break;
            default:
                System.out.println("Opção inválida.");
            }
        }while (op != 3);         
    } 
}