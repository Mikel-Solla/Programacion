package ejercicio21;

import javax.swing.JOptionPane;

public class Ejercicio21 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero mayor que 0 y te dire si es primo"));
        if(num<=3)
            if(num==1)
                JOptionPane.showMessageDialog(null,"no es primo");
            else
                JOptionPane.showMessageDialog(null,"Es primo");
        else{
            int divisor=num-1;
            int resto;
            do{
                resto=num%divisor;
                divisor=divisor-1;
            }
            while(resto != 0 && divisor==1);
            if(resto==0)
                JOptionPane.showMessageDialog(null,"es primo");
            else
                JOptionPane.showMessageDialog(null,"no es primo");
        }
            
    }
    
}
