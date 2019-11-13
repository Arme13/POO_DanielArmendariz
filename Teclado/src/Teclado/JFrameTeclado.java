/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dany_
 */
public class JFrameTeclado extends JFrame {
    
    public JFrameTeclado(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        //Creamos el componente para la parte de arriba
        JPanel panelArriba = new JPanel(new GridLayout(1, 10));
        //Creamos los botones
        Dimension dim = new Dimension(30,30);
        JButtonT btn1 = new JButtonT("1", dim, Color.CYAN);
        JButtonT btn2 = new JButtonT("2", dim, Color.CYAN);
        JButtonT btn3 = new JButtonT("3", dim, Color.CYAN);
        JButtonT btn4 = new JButtonT("4", dim, Color.CYAN);
        JButtonT btn5 = new JButtonT("5", dim, Color.CYAN);
        JButtonT btn6 = new JButtonT("6", dim, Color.CYAN);
        JButtonT btn7 = new JButtonT("7", dim, Color.CYAN);
        JButtonT btn8 = new JButtonT("8", dim, Color.CYAN);
        JButtonT btn9 = new JButtonT("9", dim, Color.CYAN);
        JButtonT btn0 = new JButtonT("0", dim, Color.CYAN);
        
        //Agregamos los botones al panelArriba
        panelArriba.add(btn1);
        panelArriba.add(btn2);
        panelArriba.add(btn3);
        panelArriba.add(btn4);
        panelArriba.add(btn5);
        panelArriba.add(btn6);
        panelArriba.add(btn7);
        panelArriba.add(btn8);
        panelArriba.add(btn9);
        panelArriba.add(btn0);
        
        setLayout(new BorderLayout());
        add(panelArriba,BorderLayout.NORTH);
        
        //Creamos el componente para la parte izquierda
        JPanel panelIzq = new JPanel(new GridLayout(3, 10));
        //Creamos los botones
        Dimension dimen = new Dimension(40,40);
        JButtonT btnA = new JButtonT("a", dimen, Color.CYAN);
        JButtonT btnB = new JButtonT("b", dimen, Color.CYAN);
        JButtonT btnC = new JButtonT("c", dimen, Color.CYAN);
        JButtonT btnD = new JButtonT("d", dimen, Color.CYAN);
        JButtonT btnE = new JButtonT("e", dimen, Color.CYAN);
        JButtonT btnF = new JButtonT("f", dimen, Color.CYAN);
        JButtonT btnG = new JButtonT("g", dimen, Color.CYAN);
        JButtonT btnH = new JButtonT("h", dimen, Color.CYAN);
        JButtonT btnI = new JButtonT("i", dimen, Color.CYAN);
        JButtonT btnJ = new JButtonT("j", dimen, Color.CYAN);
        JButtonT btnK = new JButtonT("k", dimen, Color.CYAN);
        JButtonT btnL = new JButtonT("l", dimen, Color.CYAN);
        JButtonT btnM = new JButtonT("m", dimen, Color.CYAN);
        JButtonT btnN = new JButtonT("n", dimen, Color.CYAN);
        JButtonT btnÑ = new JButtonT("ñ", dimen, Color.CYAN);
        JButtonT btnO = new JButtonT("o", dimen, Color.CYAN);
        JButtonT btnP = new JButtonT("p", dimen, Color.CYAN);
        JButtonT btnQ = new JButtonT("q", dimen, Color.CYAN);
        JButtonT btnR = new JButtonT("r", dimen, Color.CYAN);
        JButtonT btnS = new JButtonT("s", dimen, Color.CYAN);
        JButtonT btnT = new JButtonT("t", dimen, Color.CYAN);
        JButtonT btnU = new JButtonT("u", dimen, Color.CYAN);
        JButtonT btnV = new JButtonT("v", dimen, Color.CYAN);
        JButtonT btnW = new JButtonT("w", dimen, Color.CYAN);
        JButtonT btnX = new JButtonT("x", dimen, Color.CYAN);
        JButtonT btnY = new JButtonT("y", dimen, Color.CYAN);
        JButtonT btnZ = new JButtonT("z", dimen, Color.CYAN);
        
        //Agregamos los botones al panelIzq
        panelIzq.add(btnA);
        panelIzq.add(btnB);
        panelIzq.add(btnC);
        panelIzq.add(btnD);
        panelIzq.add(btnE);
        panelIzq.add(btnF);
        panelIzq.add(btnG);
        panelIzq.add(btnH);
        panelIzq.add(btnI);
        panelIzq.add(btnJ);
        panelIzq.add(btnK);
        panelIzq.add(btnL);
        panelIzq.add(btnM);
        panelIzq.add(btnN);
        panelIzq.add(btnÑ);
        panelIzq.add(btnO);
        panelIzq.add(btnP);
        panelIzq.add(btnQ);
        panelIzq.add(btnR);
        panelIzq.add(btnS);
        panelIzq.add(btnT);
        panelIzq.add(btnU);
        panelIzq.add(btnV);
        panelIzq.add(btnW);
        panelIzq.add(btnX);
        panelIzq.add(btnY);
        panelIzq.add(btnZ);
        
        add(panelIzq,BorderLayout.WEST);
        
        //Creamos el componente para la parte derecha
        JPanel panelDer = new JPanel(new GridLayout(2, 3));
        //Creamos los botones
        Dimension dimensi = new Dimension(25,25);
        JButtonT btnArriba = new JButtonT("Arriba", dimensi, Color.CYAN);
        JButtonT btnAbajo = new JButtonT("Abajo", dimensi, Color.CYAN);
        JButtonT btnIzq = new JButtonT("<-", dimensi, Color.CYAN);
        JButtonT btnDer = new JButtonT("->", dimensi, Color.CYAN);
        
        //agregamos los botones
        panelDer.add(btnArriba);
        panelDer.add(btnIzq);
        panelDer.add(btnDer);
        panelDer.add(btnAbajo);
        
        add(panelDer,BorderLayout.EAST);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Escuchador numeros
        ListenersNum escn = new ListenersNum();
        btn1.addKeyListener(escn);
        btn2.addKeyListener(escn);
        
        //Escuchador letras
        ListenersLetras escL = new ListenersLetras();
        btnA.addKeyListener(escL);
    }
    
}
