/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] mes=new String[12];
        mes[0]="ENERO";
        mes[1]="FEBRERO";
        mes[2]="MARZO";
        mes[3]="ABRIL";
        mes[4]="MAYO";
        mes[5]="JUNIO";
        mes[6]="JULIO";
        mes[7]="AGOSTO";
        mes[8]="SEPTIEMBRE";
        mes[9]="OCTUBRE";
        mes[10]="NOVIEMBRE";
        mes[11]="DICIEMBRE";
        try{
        String m=JOptionPane.showInputDialog("Introduce un mes");
        m=m.toUpperCase();
        for (String me : mes) {
            if (m.contentEquals(me)) 
                JOptionPane.showMessageDialog(null, "Mes escrito correctamente");  
        }
        }
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Mal excrito");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha saltado algun error");
        }
    }
    
}
