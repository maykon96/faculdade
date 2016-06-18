/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import model.Menu;
import model.Pizza;

/**
 *
 * @author maykaoo
 */
public class repositorioPizzas {

    private static ArrayList<Pizza> pizzas = new ArrayList();
    
    public static Pizza findPizzaByNome(String nome) {

        Pizza busca = null;

        for (Pizza pizza : pizzas) {
            if (pizza.getNome().equals(nome)) {
                busca = pizza;
            }
        }

        return busca;
    }

    public static ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public void removePizza(Pizza pizza) {
        this.pizzas.remove(pizza);
    }

}
