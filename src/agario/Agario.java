/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agario;

import environment.ApplicationStarter;

/**
 *
 * @author PrivettBoy
 */
public class Agario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationStarter.run("Agar.io", new Computer());
    }
    
}
