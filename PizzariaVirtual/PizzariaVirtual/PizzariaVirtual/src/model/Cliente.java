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

    public Cliente(String nome, String endereco, String telefone, String cpf, Cartao cartao) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroTelefone = telefone;
        this.cpf = cpf;
        this.cartoes.add(cartao);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getCpf() {
        return cpf;
    }

    public ArrayList<Cartao> getCartoes() {
        return cartoes;
    }

    public void addCartao(Cartao cartao) {
        this.cartoes.add(cartao);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
