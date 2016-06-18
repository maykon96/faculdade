/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import repositorio.repositorioProtocolos;
import view.Console;

/**
 *
 * @author San
 */
public class Protocolo {

    private Cliente cliente;
    private String protocolo;

    /**
     * Construtor da classe
     *
     * @param cliente - cliente que fez o pedido
     */
    public Protocolo(Cliente cliente) {
        this.cliente = cliente;
        geraProtocolo();
    }

    /**
     * gera o protocolo do pedido
     */
    public void geraProtocolo() {
        this.protocolo = (new java.text.SimpleDateFormat("YYYYMMddHHmmss").format(new java.util.Date(System.currentTimeMillis())));
        repositorioProtocolos.getProtocolos().add(this);
        Console.logMensagem("Protocolo gerado: " + protocolo);
    }

    /**
     * retorna o protocolo do pedido
     *
     * @return protocolo do pedido
     */
    public String getProtocolo() {
        return protocolo;
    }

    /**
     * retorna o cliente que fez o pedido
     *
     * @return cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
}
