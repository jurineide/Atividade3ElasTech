import java.util.ArrayList;
import java.util.Scanner;

public class Dez {
    /* Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras.
    O programa deve exibir a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens.
     O programa deve continuar executando até que o usuário decida sair.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o item que deseja adicionar à lista , e sair quando finalizar  ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("sair")) {
                continuar = false;
            } else {
                listaDeCompras.add(item);
                System.out.println("Item adicionado");
                exibirLista(listaDeCompras);
            }
        }

        System.out.println("Lista de compras:");
        exibirLista(listaDeCompras);
        scanner.close();
    }

    public static void exibirLista(ArrayList<String> lista) {
        System.out.println("Lista de compras atualizada:");
        for (String item : lista) {
            System.out.println("- " + item);
        }
        System.out.println();

    }
}
