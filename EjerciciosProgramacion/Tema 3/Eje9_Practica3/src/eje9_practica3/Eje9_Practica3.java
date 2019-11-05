/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje9_practica3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Eje9_Practica3 {

    
    
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("tu nombre");
        Pedido();
        Factura(nombre);
    }
    
    public static String Factura(String nombre){
        JOptionPane.showMessageDialog(null, "NOMBRE: "+nombre+"\nLINEAS DE DETALLES: ");
        return nombre;
    }
    
    public static void Pedido(){
        String resp="";
        
        do{
            try{
                Producto();
                Cantidad();
                resp=JOptionPane.showInputDialog("¿Quieres seguir?");
                resp=resp.toUpperCase();
        }
            catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"Boton cancelar y x desactivados");
            }
        }
        while(resp.equals("SI"));
        
    }
    
    public static void Producto(){
        int precio;
        double IVA;
        String producto=JOptionPane.showInputDialog("¿Que producto quieres?\n1-Papas\n2-Papas fritas\n3-Papas al horno");
        producto=producto.toUpperCase();
        switch(producto){
            case "PAPAS":
                precio=500;
                IVA=(precio*0.04);
                break;
            case "PAPAS FRITAS":
                precio=1000;
                IVA=(precio*0.1);
                break;
            case "PAPAS AL HORNO":
                precio=1500;
                IVA=(precio*0.21);
        }
    }
    
    public static void Cantidad(){
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto quieres?"));        
    }
    
}
