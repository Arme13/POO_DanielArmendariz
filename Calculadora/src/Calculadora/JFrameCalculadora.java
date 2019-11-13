/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CRUZLEIJA
 */
public class JFrameCalculadora extends JFrame {

    public JFrameCalculadora() {
        inicializarComponentes();
        
    }

    private void inicializarComponentes() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(5,4));
        // creamos los botones
        Dimension dim = new Dimension(30,30);
        JButtonC btnC = new JButtonC("C", dim, Color.cyan);
        JButtonC btnCE = new JButtonC("CE", dim, Color.cyan);
        JButtonC btnMM = new JButtonC("+/-", dim, Color.GREEN);
        JButtonC btnMulti = new JButtonC("X", dim, Color.magenta);
        JButtonC btn7 = new JButtonC("7", dim, Color.GREEN);
        JButtonC btn8 = new JButtonC("8", dim,Color.GREEN);
        JButtonC btn9 = new JButtonC("9", dim, Color.GREEN);
        JButtonC btnDiv = new JButtonC("/", dim, Color.magenta);
        JButtonC btn4 = new JButtonC("4", dim, Color.GREEN);
        JButtonC btn5 = new JButtonC("5", dim, Color.GREEN);
        JButtonC btn6 = new JButtonC("6", dim, Color.GREEN);
        JButtonC btnMenos = new JButtonC("-", dim, Color.magenta);
        JButtonC btn1 = new JButtonC("1", dim, Color.GREEN);
        JButtonC btn2 = new JButtonC("2", dim, Color.GREEN);
        JButtonC btn3 = new JButtonC("3", dim, Color.GREEN);
        JButtonC btnPlus = new JButtonC("+", dim, Color.magenta);
        JButtonC btnCero = new JButtonC("0", dim, Color.GREEN);
        JButtonC btnPunto = new JButtonC(".", dim, Color.cyan);
        JButtonC btnIgual = new JButtonC("=", dim, Color.magenta);
        JButtonC btnAcerca = new JButtonC("?", dim, Color.cyan);
       
       
        
        
        panelCentral.add(btnC);
        panelCentral.add(btnCE);
        panelCentral.add(btnMM);
        panelCentral.add(btnMulti);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btnDiv);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btnMenos);
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btnPlus);
        panelCentral.add(btnCero);
        panelCentral.add(btnPunto);
        panelCentral.add(btnIgual);
        panelCentral.add(btnAcerca);
        
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        
        Display display = new Display();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(),auxF.getStyle(),50);
        display.setFont(nueva);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display,BorderLayout.NORTH);
        
        ListenerVerdes orejon = new ListenerVerdes(display);
        btn1.addActionListener(orejon);
        btn2.addActionListener(orejon);
        btn3.addActionListener(orejon);
        btn4.addActionListener(orejon);
        btn5.addActionListener(orejon);
        btn6.addActionListener(orejon);
        btn7.addActionListener(orejon);
        btn8.addActionListener(orejon);
        btn9.addActionListener(orejon);
        btnCero.addActionListener(orejon);
        btnMM.addActionListener(orejon);
        ListenersGrises orejon2 = new ListenersGrises(display);
        btnPlus.addActionListener(orejon2);
        btnMenos.addActionListener(orejon2);
        btnDiv.addActionListener(orejon2);
        btnMulti.addActionListener(orejon2);
        btnIgual.addActionListener(orejon2);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
    
}
