/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Introduce primer diagonal"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce segundo diagonal"));
        int area = n1*n2/2;
        JOptionPane.showMessageDialog(null,area);
    }
    
}
