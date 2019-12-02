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
        double compra=Double.parseDouble(JOptionPane.showInputDialog("Cuanto tienes que pagar"));
        double pagar=Double.parseDouble(JOptionPane.showInputDialog("Con cuanto vas a pagar"));
        
        if(compra<pagar){
            pagar=pagar-compra;
            while(pagar !=0){
                
            }
            JOptionPane.showMessageDialog(null, "Las vueltas son "+pagar);
        }
        else
            JOptionPane.showMessageDialog(null, "Tienes que pagar mas");
    
        
        
        }
}
