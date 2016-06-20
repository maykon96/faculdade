/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author maykaoo
 */
public class Cliente {

    private String nome;
    private String endereco;
    private String numeroTelefone;
    private String cpf;
    private ArrayList<Cartao> cartoes = new ArrayList();
    private ArrayList<Pedido> pedidos = new ArrayList();

    /**
     * Construtor da classe
     *
     * @param nome nome do cliente
     * @param endereco endereço do cliente
     * @param telefone telefone do cliente
     * @param cpf cpf do cliente
     * @param cartao cartão do cliente
     */
    public Cliente(String nome, String endereco, String telefone, String cpf, Cartao cartao) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroTelefone = telefone;
        this.cpf = cpf;
        this.cartoes.add(cartao);
    }

    /**
     * retorna o nome do cliente
     *
     * @return nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * seta o nome do cliente
     * 
     * @param nome nome do cliente
     */
    
     public void setNome(String nome) {
        this.nome = nome;
     }
     
    /**
     * retorna o endereço do cliente
     *
     * @return endereço do cliente
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * seta o endereço do cliente
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * retorna o numero de telefone do cliente
     *
     * @return numero de telefone do cliente
     */
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * seta o numero de telefone do cliente
     *
     * @param numeroTelefone numero de telefone do cliente
     */
    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    /**
     * retorna o numero de cpf do cliente
     *
     * @return numero de cpf do cliente
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * retorna uma lista de cartões do cliente
     *
     * @return lista de cartões do cliente
     */
    public ArrayList<Cartao> getCartoes() {
        return cartoes;
    }

    /**
     * adiciona um cartão no cadastro do cliente
     *
     * @param cartao cartão do cliente a ser adicionado
     */
    public void addCartao(Cartao cartao) {
        this.cartoes.add(cartao);
    }

    /**
     * retorna os pedidos de pizza do cliente
     *
     * @return lista de pedidos do cliente
     */
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    /**
     * seta os pedidos do cliente
     *
     * @param pedidos pedidos do cliente
     */
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
