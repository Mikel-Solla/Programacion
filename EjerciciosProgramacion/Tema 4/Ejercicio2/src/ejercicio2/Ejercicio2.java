/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] num;
        int array=Integer.parseInt(JOptionPane.showInputDialog("De que tamaño quieres el array?"));
        num=new int[array];
        int suma=0;
        int x;
        for(x=0;x<num.length;x++){
            num[x]=(int)(Math.random()*10);
            suma=suma+num[x];
            JOptionPane.showMessageDialog(null,num[x]);
        }
        JOptionPane.showMessageDialog(null,"La suma total es "+suma);
    }
    
}
