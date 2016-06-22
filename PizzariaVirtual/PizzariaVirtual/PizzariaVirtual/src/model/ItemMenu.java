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
public class ItemMenu {
    
    private Pizza pizza = new Pizza();
    private double preco=0;
    private String tamanho;

    /**
     * retorna uma pizza que será apresentada
     * @return pizza que será apresentada
     */
    public Pizza getPizza() {
        return pizza;
    }

    /**
     * seta uma pizza que será apresentada 
     * @param pizza - pizza que será apresentada
     */
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * retorna o valor da pizza pequena
     * @return valor da pizza pequena
     */
    public double getPrecoPequena() {
        return precoPequena;
    }

    /**
     * seta o valor da pizza pequena
     * @param precoPequena - o valor da pizza pequena
     */
    public void setPrecoPequena(double precoPequena) {
        this.precoPequena = precoPequena;
    }

    /**
     * retorna o valor da pizza media
     * @return o valor da pizza media
     */
    public double getPrecoMedia() {
        return precoMedia;
    }

    /**
     * seta o valor da pizza media
     * @param precoMedia - o valor da pizza media
     */
    public void setPrecoMedia(double precoMedia) {
        this.precoMedia = precoMedia;
    }

    /**
     * retorna o valor da pizza grande
     * @return o valor da pizza grande
     */
    public double getPrecoGrande() {
        return precoGrande;
    }

    /**
     * seta o valor da pizza grande
     * @param precoGrande - o valor da pizza grande
     */
    public void setPrecoGrande(double precoGrande) {
        this.precoGrande = precoGrande;
    }
    
}
