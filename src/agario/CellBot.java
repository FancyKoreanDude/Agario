/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agario;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author theme
 */
public class CellBot {

    {
    double x = -1000;
    }
    public CellBot() {
        this.house = house;
        System.out.println("im alive");
    }

    private House house;

    /**
     * @return the house
     */
    public House getHouse() {
        return house;
    }

    /**
     * @param house the house to set
     */
    public void setHouse(House house) {
        this.house = house;
    }

    public void draw(Graphics graphics, double x) {
        double y;
        // every frame redraw, draw a diff
        if (x == -1000) {
            x = 0;
            System.out.println(x);
                x = x + 1;
                System.out.println(x);
        }

    }
}
