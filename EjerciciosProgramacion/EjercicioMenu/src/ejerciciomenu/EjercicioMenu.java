/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomenu;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class EjercicioMenu {

    
    
    public static void main(String[] args) {
        int num1;
        int num2;
        try{
        int elegir=Integer.parseInt(JOptionPane.showInputDialog("1-Suma\n2-Resta\n3-Tabla de multiplicar\n4-Cociente y resto de division\n5-Salir"));
        switch(elegir){
            case 1:
                num1=Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
                num2=Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));
                int suma=num1+num2;
                JOptionPane.showMessageDialog(null, "La suma es "+suma);
                break;
            case 2:
                num1=Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
                num2=Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));
                int resta=num1-num2;
                JOptionPane.showMessageDialog(null, "La suma es "+resta);
                break;
            case 3:
                num1=Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
                int mult;
                for(int cont=0;cont<11;cont++){
                    mult=num1*cont;
                    JOptionPane.showMessageDialog(null,num1+"X"+cont+"="+ mult);
                }
                break;
            case 4:
                num1=Integer.parseInt(JOptionPane.showInputDialog("Primer numero"));
                num2=Integer.parseInt(JOptionPane.showInputDialog("Segundo numero"));
                double divi=num1/num2;
                double resto=num1%num2;
                JOptionPane.showMessageDialog(null,"La division da "+divi+" y el resto es "+resto);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No has elegido nada");
        }
        
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Introduce un numero");
        }
        }
        }
            
        
    

    

