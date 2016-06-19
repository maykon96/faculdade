/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author maykaoo
 */
public class Menu {

    private static ArrayList<ItemMenu> menu = new ArrayList();
    private static int idPizzaDia;

    /**
     * retorna o menu da pizzaria
     *
     * @return menu da pizzaria
     */
    public static ArrayList<ItemMenu> getMenu() {
        return menu;
    }

    /**
     * adiciona uma pizza ao menu
     *
     * @param item uma pizza do menu
     */
    public static void addPizza(ItemMenu item) {
        Menu.menu.add(item);
    }

    /**
     * retira uma pizza do menu
     *
     * @param item pizza do menu
     */
    public static void removePizza(ItemMenu item) {
        Menu.menu.remove(item);
    }

    /**
     * retorna o id da pizza do dia
     *
     * @return id da pizza do dia
     */
    public static int getIdPizzaDia() {
        return idPizzaDia;
    }

    /**
     * gera uma pizza do dia
     */
    public static void geraPizzaDia() {
        Random gerador = new Random();
        Menu.idPizzaDia = gerador.nextInt(menu.size());
    }
}
