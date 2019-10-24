package ejercicio16;

import javax.swing.JOptionPane;

public class Ejercicio16 {

    public static void main(String[] args) {
        String resp;
        int cont=0;
        int edad;
        int suma=0;
        do{
            edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
            
            cont=cont+1;
            suma=suma+edad;
            
            resp=JOptionPane.showInputDialog("¿Quieres continuar?");
        }
        while(resp.contentEquals("si"));
        int prom=suma/cont;
        JOptionPane.showMessageDialog(null, "El promedio es " + prom);
    }
    
}
