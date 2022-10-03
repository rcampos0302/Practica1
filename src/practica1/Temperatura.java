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
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        byte temp;    
        
        temp  = Byte.parseByte(JOptionPane.showInputDialog("Digite la"
                + " temperatura en grados centrigrados"));
        if(temp<=10){
            JOptionPane.showMessageDialog(null,"Frio");
        }
        else if(temp >10 && temp<=20){
            JOptionPane.showMessageDialog(null,"Nublado");
        }
         else if(temp>20 && temp<=30){
            JOptionPane.showMessageDialog(null,"Caloroso");
        }
         else if(temp>30){
            JOptionPane.showMessageDialog(null,"Tropical");
        }
        
    }
    
}
