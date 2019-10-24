/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resp;
        int nota=0;
        int aprovados=0;
        do{
           nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce nota"));
           if(nota>=0 && nota<=10){
               if(nota>=6){
                   JOptionPane.showMessageDialog(null, "Has aprobado");
                   aprovados=aprovados+1;
               }
               else
                   JOptionPane.showMessageDialog(null, "Ha suspendido");
           }
           else
               JOptionPane.showMessageDialog(null,"Nota mal introducida");
        resp=JOptionPane.showInputDialog("¿Quieres continuar?");
        }
        while(resp.contentEquals("si"));
        JOptionPane.showMessageDialog(null,"Hay "+aprovados +" aprobados");
    }
    
}
