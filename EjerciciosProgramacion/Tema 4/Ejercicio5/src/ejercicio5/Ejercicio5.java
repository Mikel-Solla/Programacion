/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int [][] fecha=new int[12][31];
        
        String comienzo=JOptionPane.showInputDialog("¿Quieres empezar?");
        while(comienzo.equalsIgnoreCase("Si")){
            try{
            int mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes"));
            for(int x=0;x<fecha.length;x++){
                if(mes==x){
                int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia"));
                for(int y=0;y<fecha.length;y++){
                    if(dia==y){
                        int litro=Integer.parseInt(JOptionPane.showInputDialog("Introduce los litros"));
                        
                    }
                    
                }
                }
            }
            
            
            
            
            
            comienzo=JOptionPane.showInputDialog("¿Quieres seguir?");
        }
        
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Escribe numeros");
        } 
            
        }
    }
        
        
    }

