/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nroFinal=Integer.parseInt( JOptionPane.showInputDialog("¿ Cuántos números quieres de la serie de Fibonacci?"));
        int n1=1;
        System.out.println(n1);
        int n2=1;
        int cont=2;
        System.out.println(n2);
        
        while(cont<nroFinal){
            int n3=n1+n2;
            System.out.println(n3);
            cont=cont+1;
            n1=n2;
            n2=n3;
        }
        
    }
    
}
