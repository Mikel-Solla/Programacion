/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionotas;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class EjercicioNotas {

    
    public static void main(String[] args) {
        try{
        String nombre;
        int nota;
        int media=0;
        int suma=0;
        do{
            
            nombre=JOptionPane.showInputDialog("Introduce el nombre del alumno");
            try{
            for(int cont=0;cont<6;cont++){
                nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce nota"));
                suma=suma+nota;
            }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Pero que nabo eres tio");
            }
            media=suma/6;
            System.out.println(nombre+":"+media);
        }
        while(!nombre.contentEquals("Fin"));
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Eres tontisimo");
        }
    }
    

}
