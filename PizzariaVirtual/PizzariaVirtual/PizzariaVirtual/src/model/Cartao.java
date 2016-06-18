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
public class Cartao {

    private String tipo;
    private String numero;
    private int mes;
    private int ano;

    /**
     * Construtor da classe
     *
     * @param tipo tipo do cartão
     * @param numero do cartão
     */
    public Cartao(String tipo, String numero) {
        this.tipo = tipo;
        this.numero = numero;
    }

    /**
     * Retorna o tipo do cartão
     *
     * @return tipo do cartão
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * seta o tipo de cartão
     *
     * @param tipo - tipo do cartão
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Retorna o numero o cartao
     *
     * @return numero do cartão
     */
    public String getNumero() {
        return numero;
    }

    /**
     * seta o numero do cartão
     *
     * @param numero - numero do cartão
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Retorna o mes da validade do cartão
     *
     * @return mes da validade do cartão
     */
    public int getMes() {
        return mes;
    }

    /**
     * Seta o mes da validade do cartão
     *
     * @param mes - o mes da validade do cartão
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Retorna o ano da validade do cartão
     *
     * @return ano da validade do cartão
     */
    public int getAno() {
        return ano;
    }

    /**
     * seta o ano da validade do cartão
     *
     * @param ano - ano da validade do cartão
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

}
