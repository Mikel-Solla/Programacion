/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a= Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero"));
        int b= Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero"));
        int c= Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero"));
        int big=0;
        int small=0;
        
        if(a>b){
            big=a;
            small=b;
            if(a>c)
                if(b>c)
                    small=c;
                
            
            else
                big=c;
            
        }
        else{
            big=b;
            small=a;
            if(b>c)
                if(a>c)
                    small=c;
                
            
            else
                big=c;
            
        }
        JOptionPane.showMessageDialog(null, "El pequeño es "+small +" y el grande es "+ big);
    }
    
}
