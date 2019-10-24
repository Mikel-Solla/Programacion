package ejercicio22;

import javax.swing.JOptionPane;

public class Ejercicio22 {

    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog("INtroduce un numero"));
        for(int cont=0;cont<num;cont++){
            if(num<=3)
            if(num==1)
                JOptionPane.showMessageDialog(null,"no es primo");
            else
                JOptionPane.showMessageDialog(null,"Es primo");
            else{
                int divisor=num-1;
                int resto=0;
                do{
                    resto=num%divisor;
                    divisor=divisor-1;
                }
                while(resto==0 && divisor==1);
                if(resto==0)
                    JOptionPane.showMessageDialog(null,"no es primo");
                else
                    JOptionPane.showMessageDialog(null,"Es primo");
            }
        }
    }
    
}
