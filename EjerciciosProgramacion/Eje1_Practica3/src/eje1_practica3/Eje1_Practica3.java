package eje1_practica3;

import javax.swing.JOptionPane;

public class Eje1_Practica3 {

    public static void main(String[] args) {
        String n=JOptionPane.showInputDialog("Introduce una cadena");
        String vocales="aeiou";
        int cont=0;
        for(int x=0;x<n.length();x++){
            int y;
            for(y=0; y < vocales.length();y++){}
            if(n.charAt(x)==vocales.charAt(y))
                cont=cont+1;
        }
        JOptionPane.showMessageDialog(null, cont);
        }
    
    
}
