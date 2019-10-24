package ejercicio20;

import javax.swing.JOptionPane;

public class Ejercicio20 {

    public static void main(String[] args) {
        int aleatorio = (int)(Math.random()*100+1);
        JOptionPane.showMessageDialog(null, aleatorio);
        
        int num;
        String resp;
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero"));
            if(num==aleatorio){
                JOptionPane.showMessageDialog(null, "Has ganado");
                resp="no";
            }
            else{
                if(num<aleatorio)
                    JOptionPane.showMessageDialog(null,"El numero es mayor");
                else
                    JOptionPane.showMessageDialog(null,"El numero es menor");

                resp=JOptionPane.showInputDialog("¿Quieres intentarlo otra vez?");
            }
            
        }
        while(resp.equals("si"));
        JOptionPane.showMessageDialog(null, "fin");
    }
    
}
