/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author 1GDAW08
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] abecedario=new char[27];
        abecedario[0]='a';
        abecedario[1]='b';
        abecedario[2]='c';
        abecedario[3]='d';
        abecedario[4]='e';
        abecedario[5]='f';
        abecedario[6]='g';
        abecedario[7]='h';
        abecedario[8]='i';
        abecedario[9]='j';
        abecedario[10]='k';
        abecedario[11]='l';
        abecedario[12]='m';
        abecedario[13]='n';
        abecedario[14]='ñ';
        abecedario[15]='o';
        abecedario[16]='p';
        abecedario[17]='q';
        abecedario[18]='r';
        abecedario[19]='s';
        abecedario[20]='t';
        abecedario[21]='u';
        abecedario[22]='v';
        abecedario[23]='w';
        abecedario[24]='x';
        abecedario[25]='y';
        abecedario[26]='z';
        
        
        int [] contador=new int[27];
        String cadena=JOptionPane.showInputDialog("");
        int x;
        int y;
        for( x=0;x<cadena.length();x++){
            for(y=0;y<abecedario.length;y++){
                if(cadena.charAt(x)==abecedario[y]){
                    contador[y]+=1;
                }
                
            }
        }
        JOptionPane.showMessageDialog(null, "");
    }
    
}
