/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author maykaoo
 */
public class Pedido {

    private int idPedido;
    private ArryaList<ItemMenu> pedidos = new ArrayList<>();
    private Calendar horaPedido;
    private Calendar dataPedido;
    private boolean status = false;
    
    /**
     * retorna o id da pizza pedida
     *
     * @return id da pizza do dia
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * seta o id da pizza pedida
     *
     * @param idPedido
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * retorna o tamanho da pizza pedida
     *
     * @return tamanho da pizza pedida
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * seta o tamanho da pizza pedida
     *
     * @param tamanho tamanho da pizza pedida
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * seta a quantidade de pizzas pedidas
     *
     * @return quantidade de pizzas pedidas
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * seta a quantidade de pizzas pedidas
     *
     * @param quantidade quantidade de pizzas pedidas
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
