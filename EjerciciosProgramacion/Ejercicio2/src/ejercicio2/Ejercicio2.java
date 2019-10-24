package ejercicio2;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Introduce primer numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce segundo numero"));
        int multi=n1*n2;
        JOptionPane.showMessageDialog(null, multi);
    }
    
}
