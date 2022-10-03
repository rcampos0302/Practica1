/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class Casino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte valorUno;
        byte valorDos;
        byte valorTres;
        byte cont=0;

        
        
        valorUno  = Byte.parseByte(JOptionPane.showInputDialog("Digite"
                + " el valor del dado 1"));
        if(valorUno==6){
            cont+=1;
        }
        valorDos  = Byte.parseByte(JOptionPane.showInputDialog("Digite"
                + " el valor del dado 2"));
        if(valorDos==6){
            cont+=1;
        }
        valorTres  = Byte.parseByte(JOptionPane.showInputDialog("Digite"
                + " el valor del dado 3"));
        if(valorTres==6){
            cont+=1;
        }
        
        switch (cont) {
            case 0:
                JOptionPane.showMessageDialog(null,"Miedo");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Justo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"muy "
                        + "bueno");
                break;
            case 3:       
                JOptionPane.showMessageDialog(null,"Genial");
                break;
            default:
                break;
        }
        
    }
    
}
