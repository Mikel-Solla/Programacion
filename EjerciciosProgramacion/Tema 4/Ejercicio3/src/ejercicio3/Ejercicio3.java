/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] abecedario=new char[27];
        abecedario[0]='A';
        abecedario[1]='B';
        abecedario[2]='C';
        abecedario[3]='D';
        abecedario[4]='E';
        abecedario[5]='F';
        abecedario[6]='G';
        abecedario[7]='H';
        abecedario[8]='I';
        abecedario[9]='J';
        abecedario[10]='K';
        abecedario[11]='L';
        abecedario[12]='M';
        abecedario[13]='N';
        abecedario[14]='Ñ';
        abecedario[15]='O';
        abecedario[16]='P';
        abecedario[17]='Q';
        abecedario[18]='R';
        abecedario[19]='S';
        abecedario[20]='T';
        abecedario[21]='U';
        abecedario[22]='V';
        abecedario[23]='W';
        abecedario[24]='X';
        abecedario[25]='Y';
        abecedario[26]='Z';
        String cadena="";
        int posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduce posicion"));
        while(posicion!=(-1)){
            cadena +=abecedario[posicion];
            posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduce posicion"));
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
}
