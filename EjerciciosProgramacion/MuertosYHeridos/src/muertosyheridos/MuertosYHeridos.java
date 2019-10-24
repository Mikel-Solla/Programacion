/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muertosyheridos;

import java.awt.HeadlessException;
import static java.lang.Math.random;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class MuertosYHeridos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alea = (int)(Math.random()*1000+1);
        int num3;
        int num2;
        int num1;
        int nume3;
        int nume2;
        int nume1;
        try{
        System.out.println(alea);
        num1=alea%10;
        alea=alea/10;
        num2=alea%10;
        alea=alea/10;
        num3=alea%10;
        System.out.println(num3);
        System.out.println(num2);
        System.out.println(num1);
        
        int num=Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar el numero"));
        nume1=num%10;
        num=num/10;
        nume2=num%10;
        num=num/10;
        nume3=num%10;
        
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Introduce un numero");
        }
        catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "mal");
        }
                 
    }
    
}

