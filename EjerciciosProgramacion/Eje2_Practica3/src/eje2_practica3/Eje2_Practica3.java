/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2_practica3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Eje2_Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("");
        String n2=n;
        int y;
            for(y = n2.length()-1;y>-1;y--){
                System.out.print(n2.charAt(y)+" ");
            }
    }
    
}
