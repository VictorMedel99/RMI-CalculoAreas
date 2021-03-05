/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.rmi.Naming;

/**
 *
 * @author alberto
 */
public class Servidor {
    public Servidor(){
        try {
            System.setProperty("java.rmi.server.codebase", "192.168.0.11");
            
            InterfazRemota areas = new Areas();
            Naming.rebind("//localhost/Areas", areas);
         
            System.out.println("Servidor iniciado...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        new Servidor();
    }
    
}
