/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import model.Pedido;
import view.Console;

/**
 *
 * @author maykaoo
 */
public class ControleCompra {

    /**
     * Cliente escolhe qual pizza deseja
     *
     * @return pizza pedida
     */
    public static Pedido realizaPedido() {

        boolean controle = false;
        Pedido pedido = new Pedido();
        int id = Console.entradaInt("Informe o ID: ");
        String tamanho = Console.entradaString("Informe o tamanho:");
        int quantidade = Console.entradaInt("Informe a quantidade: ");


        pedido.setIdPedido(id);
        pedido.setTamanho(tamanho);
        return pedido;
    }

    /**
     * Conta o tempo da geração do pedido até a impressão da nota
     *
     * @param init tempo da geração do pedido
     * @return diff - tempo da geração do pedido até a impressão da nota
     * @throws InterruptedException - Caso um Thread for interrompido.
     */
    public static long contaTempo(long init) throws InterruptedException {
        long diff;
        long end;

        Thread.sleep(61000);
        end = System.currentTimeMillis();
        diff = end - init;
        System.out.println("Demorou " + ((diff / 1000) / 60) + " minutos");

        return diff;

    }

}
