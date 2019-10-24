/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericcio14;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejericcio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0;
        int suma = 0;
        while(cont<3){
            int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            suma=suma+n;
            cont=cont+1;
        }
        JOptionPane.showMessageDialog(null, "La suma da "+suma);
    }
    
}
