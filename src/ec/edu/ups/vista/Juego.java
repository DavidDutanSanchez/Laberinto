/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Laberinto;
import ec.edu.ups.modelo.Personaje;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author surfa
 */
public class Juego extends JPanel{
    
    Laberinto laberinto=new Laberinto();
    Personaje personaje=new Personaje();
    
    public Juego(){
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        setFocusable(true);
    }
  
    @Override
    public void paint(Graphics grafico){
        laberinto.paint(grafico);
        personaje.paint(grafico);
    }
    
    public static void main (String [] david){
    JFrame miVentana=new JFrame("Laberinto");
      Juego game= new Juego();
      miVentana.add(game);
      
      miVentana.setSize(900, 600);
      miVentana.setLocation(400, 300);
      miVentana.setVisible(true);
      
      miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      while(true){
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
          game.repaint();
      }
    }
}
