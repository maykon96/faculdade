/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import model.Protocolo;

/**
 *
 * @author maykaoo
 */
public class repositorioProtocolos {
    
    private static ArrayList<Protocolo> protocolos = new ArrayList();

    public static ArrayList<Protocolo> getProtocolos() {
        return protocolos;
    }  
}
