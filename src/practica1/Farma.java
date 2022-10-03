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
public class Farma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorInicial;
        byte tipoPago;
        double modificador;
        double totalCompra;
        
        
        valorInicial  = Integer.parseInt(JOptionPane.showInputDialog("Digite"
                + " el valor del dado 1"));
        tipoPago  = Byte.parseByte(JOptionPane.showInputDialog("Digite "
                + "1 para efectivo - 2 para tarjeta"));
        if (tipoPago == 1){
            modificador = valorInicial * 0.03;
            totalCompra = valorInicial + modificador;
            JOptionPane.showMessageDialog(null,"El recargo por "
                    + " tarjeta es de " +modificador+ " colones y el total a "
                            + "pagar es " + totalCompra + " colones");
        }
        else{
            modificador = valorInicial * 0.05;
            totalCompra = valorInicial - modificador;
            JOptionPane.showMessageDialog(null,"El descuento por "
                    + " efectivo es de " +modificador+ " colones y el total a "
                            + "pagar es " + totalCompra + " colones");
        }
  
    }
    
}
