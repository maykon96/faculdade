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
public class Pizza {

    private String nome;
    private String ingredientes;

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
     * @param nome - nome do cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * retorna os igredientes da pizza
     *
     * @return os ingredientes da pizza
     */
    public String getIngredientes() {
        return ingredientes;
    }

    /**
     * seta os ingredientes da pizza
     *
     * @param ingrediente - ingredintes da pizza
     */
    public void setIngrediente(String ingrediente) {
        if (this.ingredientes == null) {
            this.ingredientes = ingrediente;
        } else {
            this.ingredientes = this.ingredientes + "," + ingrediente;
        }
    }

    /**
     * retorna a quantidade vendida da pizza no mes
     *
     * @return quantidade vendida no mes
     */
    public int getQuantidadeMes() {
        return quantidadeMes;
    }

    /**
     * seta a quantidade da pizza vendida no mes
     *
     * @param quantidadeMes -quantidade da pizza vendida no mes
     */
    public void setQuantidadeMes(int quantidadeMes) {
        this.quantidadeMes = quantidadeMes;
    }

}
