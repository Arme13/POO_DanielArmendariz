/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author dany_
 */
public class ListenersLetras implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        JButtonT aux = (JButtonT)e.getSource();
       
        String a = e.getKeyChar()+"";
         if(a.equals("a")){
         aux.setBackground(Color.red);
         }
       
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JButtonT aux = (JButtonT)e.getSource();
        
         String a = e.getKeyChar()+"";
         if(a.equals("a")){
         aux.setBackground(Color.cyan);
         }
        
         System.out.println("KeyReleased "+e.getKeyChar());
         
    }
    
}
