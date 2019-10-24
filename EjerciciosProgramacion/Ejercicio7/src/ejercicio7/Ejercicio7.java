/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce segundo numero"));
        int h1=(n1*n1)+(n2*n2);
        double h2=Math.sqrt(h1);
        JOptionPane.showMessageDialog(null,h2);
    }
    
}
