package ejercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 1;
        int apto=0;
        while(cont<30){
            String nombre=JOptionPane.showInputDialog("Introduce el nombre");
            String sexo=JOptionPane.showInputDialog("Introduce el sexo");
            int peso= Integer.parseInt(JOptionPane.showInputDialog("Introduce el peso"));
            int altura= Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
            int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
            if(sexo.equals("M")){
                if(altura>=170){
                    if(peso>=70){
                        JOptionPane.showMessageDialog(null, "Apto");
                        apto=apto+1;
                        cont=cont+1;
                    }
                    else
                        JOptionPane.showMessageDialog(null, "No apto");
                        cont=cont+1;
                }
                else
                    JOptionPane.showMessageDialog(null, "No apto");
                cont=cont+1;
            }
            else
                if(altura>=160){
                    if(peso>=60){
                        JOptionPane.showMessageDialog(null, "Apto");
                        apto=apto+1;
                        cont=cont+1;
                    }
                    else
                        JOptionPane.showMessageDialog(null, "No apto");
                    cont=cont+1;
                }
            else
                    JOptionPane.showMessageDialog(null, "No apto");
                    cont=cont+1;
        }
        JOptionPane.showMessageDialog(null, "Hay "+apto +" aptos");
    }
    
}
