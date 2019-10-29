/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje9_practica3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Eje9_Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("tu nombre");
        Factura(nombre);
    }
    
    public static String Factura(String nombre){
        JOptionPane.showMessageDialog(null, "NOMBRE:"+nombre);
        return nombre;
    }
    
}
