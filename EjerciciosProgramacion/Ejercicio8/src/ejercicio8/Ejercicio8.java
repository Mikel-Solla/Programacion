/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero"));
        if(n1>=0 && n1<=10){
            if(n1>=5){
                JOptionPane.showMessageDialog(null, "Aprobado");
            }
            else{
                JOptionPane.showMessageDialog(null,"Suspenso");
            }      
        }
        else
            JOptionPane.showMessageDialog(null, "Numero mal introducido");
    }
    
}
