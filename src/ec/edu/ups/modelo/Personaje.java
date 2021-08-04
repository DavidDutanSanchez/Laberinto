/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author surfa
 */
public class Personaje {
    private int x=30;
    private int y=30;
    private final int ancho=25;
    private final int alto=25;
    private final int movimiento=40;
    
    public void paint(Graphics grafico){
        grafico.setColor(Color.red);
        grafico.fillOval(x, y, ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(x, y, alto, ancho);
    }
    
    public void teclaPresionada(KeyEvent evento){
        if(evento.getKeyCode()==37){
            x=x-movimiento;
        }
         if(evento.getKeyCode()==39){
              x=x+movimiento;
        }
         if(evento.getKeyCode()==40){
              y=y+movimiento;
        }
          if(evento.getKeyCode()==38){
              y=y-movimiento;
        }
    }
}
