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

    public Cell(int x, int y, int radius, int house) {
        this.x = x;
        this.y = y;
        this.yVelocity = 20;
        this.xVelocity = 20;
        this.radius = radius;
        this.house = house;
        
    }

//       public void move() {
//        if (direction == Direction.LEFT) {
//            x -= getSpeed();
//        } else if (direction == Direction.RIGHT) {
//            x += getSpeed();
//        } else if (direction == Direction.UP) {
//            y -= getSpeed();
//        } else if (direction == Direction.UP) {
//            y += getSpeed();
//        
//    }
       


//<editor-fold defaultstate="collapsed" desc="Properties">
    private int x;
    private int y;
    private int xVelocity, yVelocity;
    private int radius;
    private int house;

    public void stop() {
        xVelocity = 0;
        yVelocity = 0;
    }
    public void draw(Graphics graphics) {
        graphics.setColor(new Color(0, 0, 255));
        graphics.fillOval(x, y, (radius * 2), (radius * 2));
    }
/*    public void move() {
        x += xVelocity;
        y += yVelocity;

    }*/

    public void moveUp() {
//        x += xVelocity;
        y -= yVelocity;

    }

    public void moveDown() {
//        x += xVelocity;
        y += yVelocity;

    }

    public void moveLeft() {
        x -= xVelocity;
//        y += yVelocity;

    }

    public void moveRight() {
        x += xVelocity;
//        y += yVelocity;

    }

    /**
     * @return the x
     */
    public Color getColor() {
        if (house == 1) {
            return Color.BLUE;
        } else if (house == 2) {
            return Color.RED;
        } else if (house == 3) {
            return Color.ORANGE;
        } else if (house == 4) {
            return Color.GREEN;
        } else if (house == 5) {
            return Color.PINK;
        } else if (house == 6) {
            return Color.GREEN;
        } else if (house == 7) {
            return Color.MAGENTA;
        } else if (house == 8) {
            return Color.CYAN;
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
    public int getHouse() {
        return house;
    }

    /**
     * @param house the house to set
     */
    public void setHouse(int house) {
        this.house = house;
    }
//</editor-fold>


}
