package ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero"));
        if(n1>0 && n1<10){
            if(n1<5){
                if(n1<4){
                    JOptionPane.showMessageDialog(null, "Muy deficiente");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Deficiente");
                }  
            }
            else{
                if(n1<7){
                    if(n1<6){
                        JOptionPane.showMessageDialog(null, "Suficiente");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Bien");
                    }
                }
                else{
                    if(n1<9){
                        JOptionPane.showMessageDialog(null, "Notable");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "sobresaliente");
                    }
                }
        }
        }
}
}
