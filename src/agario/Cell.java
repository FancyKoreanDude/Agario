/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agario;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author PrivettBoy
 */
public class Cell {
    
    public Cell(int x, int y, int radius, House house){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.house = house;
    }
 
    public void draw(Graphics graphics){
        graphics.setColor(getColor());
        graphics.fillOval(x, y, radius, radius);
    }
    
//<editor-fold defaultstate="collapsed" desc="Properties">
    private int x;
    private int y;
    private int radius;
    private House house;
    
    /**
     * @return the x
     */
    public Color getColor() {
        if (house == House.PRIVETT) {
            return Color.BLUE;
        } else if (house == House.WHITTALL) {
            return Color.RED;
        } else if (house == House.ROGERS) {
            return Color.ORANGE;
        } else if (house == House.ELLIS) {
            return Color.GREEN;
        } else if (house == House.HOPE) {
            return Color.PINK;
        } else if (house == House.MACKENZIE) {
            return Color.GREEN;
        } else if (house == House.ALEX) {
            return Color.MAGENTA;
        } else if (house == House.ALLARD) {
            return Color.YELLOW;
        } else {
            return Color.GRAY;            
        }
    }
    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }
    
    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    
    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }
    
    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
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
//</editor-fold>
    
}
