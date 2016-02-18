 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agario;

import audio.AudioPlayer;
import environment.Environment;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author PrivettBoy
 */
class Computer extends Environment {

    private Cell p1;
    private ArrayList<Cell> cells;
    private int score;
    
    public Computer() {
        p1 = new Cell( (int) Math.random() * 2880, (int) Math.random() * 1800, 20, House.PRIVETT);
        
        
        cells = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            cells.add(new Cell((int) (Math.random() * 2880), (int) (Math.random() * 1800), 10, House.ALEX));
        }
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
//        if (p1 != null) {
//            p1.move();
//        }
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//            AudioPlayer.play("/Death_no_no_noooo.wav");
//        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            p1.move();
        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (cells != null) {
            for (Cell cell : cells){
                cell.draw(graphics);
            }
        }
        
        if (p1 != null) {
            p1.draw(graphics);
        }
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Calibri", Font.BOLD, 35));
        graphics.drawString("Score: " + score, 10, 30);
    }
    
}
