/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje8_practica3;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Eje8_Practica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean correcto;
        do{
        try{
        int n=Integer.parseInt(JOptionPane.showInputDialog("¿Que quieres hacer?\n1-Calcular la edad de una persona\n2-Sumar dos numeros\n3-Contar cuantas vocales hay en una cadena\n4-Salir"));
        if(n>=1 && n<=4){
        switch(n){
            case 1:
                DarAños();  
                break;
            case 2:
                Suma();
                break;
            case 3:
                ContarVocales();
                break;
            case 4: 
                System.exit(0);
                break;
        }
        correcto=true;
        }
        else{
            JOptionPane.showMessageDialog(null,"Mete un numero del menu");
            correcto=false;
        }
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Boton cancelar y x desactivados");
            correcto=false;
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debes de meter algun numero");
            correcto=false;
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Ha saltado algun error");
           correcto=false;
        }
        }
        while(!correcto);  
    }
    
    public static void Suma(){
        try{
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
        int suma=n1+n2;
        JOptionPane.showMessageDialog(null,suma);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debes de meter algun numero");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Algo ha fallado");
        }
    }
    
    public static void DarAños(){
        try{
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Teclea el día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("Teclea el año"));
        LocalDate fechahoy=LocalDate.now();
        LocalDate respaño=fechahoy.minusYears(año);
        JOptionPane.showMessageDialog(null, "La persona tiene "+respaño.getYear()+" años");
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Debes de meter algun numero");
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "Ha saltado algun error");
        }
    }
    
    public static void ContarVocales(){
        try{
        String palabra=JOptionPane.showInputDialog("Introduce una cadena de caracteres");
        int cont=0;
        for(int x=0;x<palabra.length();x++){
            if((palabra.charAt(x)=='a')||(palabra.charAt(x)=='e')||(palabra.charAt(x)=='i')||(palabra.charAt(x)=='o')||(palabra.charAt(x)=='u'))
                cont++;
        }
        JOptionPane.showMessageDialog(null, "La palabra tiene "+cont+" vocales");
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Algo ha fallado");
        }
    }
}
