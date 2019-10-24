/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alt= Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
        int bas=Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
        int per = 2*bas +2*alt;
        JOptionPane.showMessageDialog(null, per);
    }
    
}
