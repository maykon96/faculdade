/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariavirtual;

import controler.ControleCompra;
import model.ItemMenu;
import model.Menu;
import model.Pizza;

/**
 *
 * @author maykaoo
 */
public class PizzariaVirtual {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        Pizza pizza = new Pizza();
        pizza.setIngrediente("Alho");
        pizza.setIngrediente("Milho");
        pizza.setIngrediente("Molho");
        pizza.setNome("Manezinha ao ponto");
        pizza.setQuantidadeMes(0);
        ItemMenu item = new ItemMenu();
        item.setPizza(pizza);
        item.setPrecoPequena(24.50);
        item.setPrecoMedia(45.30);
        item.setPrecoGrande(52.50);
        Menu.getMenu().add(item);
        //Console.showMenu();

        //Cliente cliente = new Cliente("Maykon Anschau Oliveira","Servidão Família Nunes da silva","96710548","08924116940",new Cartao("Crédito","254896215"));
        //cliente.getPedidos().add(ControleCompra.realizaPedido());
        
        long init = System.currentTimeMillis();
        
        ControleCompra.contaTempo(init);

    }

}
