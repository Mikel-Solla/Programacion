/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0;
        int suma=0;
        while(cont<10){
        int a= Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        cont=cont+1;
        suma=suma+a;
    }
        JOptionPane.showMessageDialog(null,"la suma da "+ suma);
    }
}
