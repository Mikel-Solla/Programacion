/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje5_practica3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Eje5_Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Teclea el año"));
        
        LocalDate fechaDos = LocalDate.of(año,mes,dia);
        
        JOptionPane.showMessageDialog(null,fechaDos);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "mal");
        }
        catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "mal");
        }
    }
    
}
