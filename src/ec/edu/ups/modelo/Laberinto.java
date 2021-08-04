/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author surfa
 */
public class Laberinto {
    private int fila=0;
    private int colomna=0;
    private final int numerofilas=10;
    private final int numeroColumnas=15;
    private final int anchoBloque=30;
    private final int altoBloque=30;
    
   public void paint(Graphics grafico){
       int[][]laberinto=obtenerLaberinto();
       
       for(fila=0;fila<numerofilas;fila++){
          for(colomna=0;colomna<numeroColumnas;colomna++){
            if(laberinto[fila][colomna]==1){
                grafico.setColor(Color.blue);
                grafico.fillRect(colomna*30, fila*30, anchoBloque, altoBloque);
                grafico.setColor(Color.black);
                grafico.drawRect(colomna*30, fila*30, anchoBloque, altoBloque);

            }  
          } 
       }
   }
    
    public int[][] obtenerLaberinto(){
        int laberinto[][]=
        {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,0,0,1,0,0,0,1,0,1,0,0,0,1,1},
        {1,1,0,1,0,1,0,1,1,1,0,1,1,1,1},
        {1,1,0,0,0,1,0,1,0,1,0,1,0,1,1},   
        {1,1,0,1,0,1,0,1,0,1,0,0,0,1,1},
        {1,1,0,1,0,1,0,0,0,1,0,1,0,1,1},
        {1,1,0,0,0,1,1,1,0,1,0,1,0,1,1},
        {1,1,0,1,0,1,0,0,0,1,0,1,0,1,1},
        {1,1,0,1,0,0,0,1,0,0,0,1,0,0,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    return laberinto;
    }
}
