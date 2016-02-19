/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agario;

import environment.ApplicationStarter;
import java.awt.Dimension;
public class Agario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationStarter.run(null, "Agar.io", new Dimension(2560, 1440), new Computer());
    }
    
}
