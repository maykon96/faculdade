/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.ItemMenu;
import model.Menu;
import model.Protocolo;

/**
 *
 * @author maykaoo
 */
public class Console {

    private static Scanner s = new Scanner(System.in);

    /**
     * Apresenta o menu de pizzas
     */
    public static void showMenu() {

        System.out.println("Pizzaria Bom Gosto!");
        for (int i = 0; i < Menu.getMenu().size(); i++) {
            ItemMenu item = Menu.getMenu().get(i);
            System.out.println((i + 1) + ". " + item.getPizza().getNome());
            System.out.println("  (" + item.getPizza().getIngredientes() + ")");
            System.out.println("   Pequena R$ " + item.getPrecoPequena() + " Media R$ " + item.getPrecoMedia() + " Grande R$ " + item.getPrecoGrande());
            System.out.println();
        }
    }

    /**
     * Recebe uma string para ser apresentada e uma String da entrada do cliente
     *
     * @param mensagem que será apresentada
     * @return a String do cliente
     */
    public static String entradaString(String mensagem) {
        System.out.print(mensagem);
        String valor = s.next();
        return valor;
    }

    /**
     * Recebe uma String para ser apresentada e o valor da entrada do cliente
     *
     * @param mensagem que será apresentada
     * @return o valor do cliente
     */
    public static int entradaInt(String mensagem) {
        System.out.print(mensagem);
        int valor = s.nextInt();
        return valor;
    }

    /**
     * Apresenta mensagem na tela
     *
     * @param mensagem a ser apresentada
     */
    public static void logMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    /**
     * Apresenta os dados referente ao protocolo
     *
     * @param protocolo a ser apresentado
     */
    public static void showProtocolo(Protocolo protocolo) {
        System.out.println("Pedido: " + protocolo.getProtocolo());
        for (int i = 0; i < protocolo.getCliente().getPedidos().size(); i++) {
            ItemMenu item = Menu.getMenu().get(protocolo.getCliente().getPedidos().get(i).getIdPedido());
            System.out.println(item.getPizza().getNome());
            System.out.println(protocolo.getCliente().getPedidos().get(i).getTamanho());
        }
    }

}
