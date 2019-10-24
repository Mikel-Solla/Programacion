/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0;
        int big=-1;
        int small=11;
        String nGrande="";
        String nPequeño="";
        while(cont<2){
            cont=cont+1;
            String n=JOptionPane.showInputDialog("Introduce el nombre");
            int nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota"));
            if(nota>=0 && nota<=10){
                if(nota>big){
                    big=nota;
                    nGrande=n;
                }
                else{
                    if(nota<big){
                        small=nota;
                        nPequeño=n;
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Nota mal introducida");
            }
        }
        JOptionPane.showMessageDialog(null, "La nota mas alta ha sido "+big+" de "+nGrande+" y la nota mas baja ha sido "+small+" de "+nPequeño);
    }
    
}
