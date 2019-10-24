/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4_practica3;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Eje4_Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        String fecha1 = JOptionPane . showInputDialog ("Teclea una fecha");
        SimpleDateFormat formato = new SimpleDateFormat ("dd-MM-yyyy");
        Date f1 = formato.parse(fecha1);
        
        String fecha2 = JOptionPane . showInputDialog ("Teclea una fecha");
        Date f2=formato.parse(fecha2);
        
        if(f1.equals(f2))
            JOptionPane.showMessageDialog(null,"d");
        else
        JOptionPane.showMessageDialog(null,"mal");
        
    }
        catch(Exception e){
            
        }
        
    }
    
    
}
