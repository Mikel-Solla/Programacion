/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a= Integer.parseInt(JOptionPane.showInputDialog("Introduce el consumo"));
         double c=0;
         if(a<=299){
            c = a*0.04;
         }
         else{
             if(300<=a && a<=499){
                 c=a*0.03;
             }
             else{
                 if(500<=a && c<=799){
                     c=300*0.03+0.02*(a-300);
                 }
                 else{
                     c=300*0.03+0.02*(a-300);
                     c=c-(c*0.0125);
                 }
             }
         }
         JOptionPane.showMessageDialog(null, "Tienes que pagar "+c);
    }
    
}
