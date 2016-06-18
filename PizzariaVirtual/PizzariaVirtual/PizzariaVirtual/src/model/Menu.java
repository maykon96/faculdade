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

    public static ArrayList<ItemMenu> getMenu() {
        return menu;
    }
    
    public static void addPizza(ItemMenu item){
        Menu.menu.add(item);
    }
    
    public static void removePizza(ItemMenu item){
        Menu.menu.remove(item);
    }

    public static int getIdPizzaDia() {
        return idPizzaDia;
    }
    
    public static void geraPizzaDia(){
        Random gerador = new Random();
        Menu.idPizzaDia=gerador.nextInt(menu.size());
    }    
}
