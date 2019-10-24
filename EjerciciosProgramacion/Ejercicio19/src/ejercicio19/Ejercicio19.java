/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int impar1=1;
        int suma=0;
        for(int cont=1;cont<num;cont++){
            suma=suma+impar1;
            impar1=impar1+2;
        }
        JOptionPane.showMessageDialog(null,suma);
    }
    
}
